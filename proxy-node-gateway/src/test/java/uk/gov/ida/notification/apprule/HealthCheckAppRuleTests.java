package uk.gov.ida.notification.apprule;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Appender;
import io.dropwizard.testing.ConfigOverride;
import io.dropwizard.testing.junit.DropwizardClientRule;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.LoggerFactory;
import uk.gov.ida.notification.apprule.base.GatewayAppRuleTestBase;
import uk.gov.ida.notification.apprule.rules.GatewayAppRule;
import uk.gov.ida.notification.apprule.rules.TestEidasSamlResource;
import uk.gov.ida.notification.apprule.rules.TestTranslatorResource;
import uk.gov.ida.notification.apprule.rules.TestVerifyServiceProviderResource;
import uk.gov.ida.notification.shared.logging.ProxyNodeLogger;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class HealthCheckAppRuleTests extends GatewayAppRuleTestBase {

    private static final String METADATA_PUBLISH_PATH = "/proxy-node-md-publish-path";
    private static final String METADATA_File_PATH =
            HealthCheckAppRuleTests.class.getClassLoader().getResource("metadata/test-proxy-node-metadata.xml").getPath();

    @ClassRule
    public static final DropwizardClientRule translatorClientRule = new DropwizardClientRule(new TestTranslatorResource());

    @ClassRule
    public static final DropwizardClientRule espClientRule = new DropwizardClientRule(new TestEidasSamlResource());

    @ClassRule
    public static final DropwizardClientRule vspClientRule = new DropwizardClientRule(new TestVerifyServiceProviderResource());

    @Mock
    private Appender<ILoggingEvent> appender;

    @Captor
    private ArgumentCaptor<ILoggingEvent> loggingEventCaptor;

    @Rule
    public GatewayAppRule proxyNodeAppRule = new GatewayAppRule(
            ConfigOverride.config("eidasSamlParserService.url", espClientRule.baseUri().toString()),
            ConfigOverride.config("verifyServiceProviderService.url", vspClientRule.baseUri().toString()),
            ConfigOverride.config("translatorService.url", translatorClientRule.baseUri() + "/translator/SAML2/SSO/Response"),
            ConfigOverride.config("redisService.local", "true"),
            ConfigOverride.config("redisService.url", ""),
            ConfigOverride.config("metadataPublishingConfiguration.metadataFilePath", METADATA_File_PATH),
            ConfigOverride.config("metadataPublishingConfiguration.metadataPublishPath", METADATA_PUBLISH_PATH)
    );

    @Rule
    public GatewayAppRule proxyNodeAppRuleMissingMetadata = new GatewayAppRule(
            ConfigOverride.config("eidasSamlParserService.url", espClientRule.baseUri().toString()),
            ConfigOverride.config("verifyServiceProviderService.url", vspClientRule.baseUri().toString()),
            ConfigOverride.config("translatorService.url", translatorClientRule.baseUri() + "/translator/SAML2/SSO/Response"),
            ConfigOverride.config("redisService.local", "true"),
            ConfigOverride.config("redisService.url", ""),
            ConfigOverride.config("metadataPublishingConfiguration.metadataFilePath", "metadata/invalid-md-path.xml"),
            ConfigOverride.config("metadataPublishingConfiguration.metadataPublishPath", METADATA_PUBLISH_PATH)
    );

    @Test
    public void shouldExposeHealthCheck() throws Exception {
        Response response = proxyNodeAppRule.target("healthcheck", proxyNodeAppRule.getAdminPort())
                .request()
                .get();

        String healthcheck = response.readEntity(String.class);

        assertThat(healthcheck).contains("\"gateway\":{\"healthy\":true}");
    }

    @Test
    public void shouldServeMetadata() throws IOException, URISyntaxException {
        Logger logger = (Logger) LoggerFactory.getLogger(ProxyNodeLogger.class);
        logger.addAppender(appender);

        final String expectedMetadata = new String(Files.readAllBytes(Paths.get(METADATA_File_PATH)));

        final Response response = proxyNodeAppRule.target(METADATA_PUBLISH_PATH).request().get();
        final String metadata = response.readEntity(String.class);

        assertThat(response.getMediaType().toString()).isEqualTo(MediaType.APPLICATION_XML);
        assertThat(metadata).isEqualTo(expectedMetadata);

        verify(appender, never()).doAppend(loggingEventCaptor.capture());
    }

    @Test
    public void shouldReturn500WhenProxyNodeMetadataMissing() throws URISyntaxException {
        final Response response = proxyNodeAppRuleMissingMetadata.target(METADATA_PUBLISH_PATH).request().get();

        assertThat(response.getMediaType().toString()).isEqualTo(MediaType.TEXT_PLAIN);
        assertThat(response.getStatus()).isEqualTo(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
    }

    @Test
    public void shouldReturnGoodResponseForFavicon() throws URISyntaxException {
        final Response response = proxyNodeAppRule.target("/favicon.ico").request().get();
        assertThat(response.getStatus()).isEqualTo(Response.Status.OK.getStatusCode());
        assertThat(response.readEntity(String.class)).isEmpty();
    }
}
