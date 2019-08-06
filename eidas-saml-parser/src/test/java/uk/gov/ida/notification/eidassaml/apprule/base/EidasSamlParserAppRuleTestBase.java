package uk.gov.ida.notification.eidassaml.apprule.base;

import io.dropwizard.testing.ConfigOverride;
import io.dropwizard.testing.junit.DropwizardClientRule;
import keystore.KeyStoreResource;
import org.junit.ClassRule;
import org.junit.Rule;
import org.opensaml.core.config.InitializationService;
import org.opensaml.saml.saml2.core.AuthnRequest;
import uk.gov.ida.notification.VerifySamlInitializer;
import uk.gov.ida.notification.apprule.rules.TestMetadataResource;
import uk.gov.ida.notification.contracts.EidasSamlParserRequest;
import uk.gov.ida.notification.eidassaml.apprule.rules.EidasSamlParserAppRule;
import uk.gov.ida.notification.saml.SamlObjectMarshaller;

import javax.print.attribute.URISyntax;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;
import java.util.Base64;

import static keystore.builders.KeyStoreResourceBuilder.aKeyStoreResource;
import static uk.gov.ida.saml.core.test.TestCertificateStrings.METADATA_SIGNING_A_PUBLIC_CERT;
import static uk.gov.ida.saml.core.test.builders.CertificateBuilder.aCertificate;

public class EidasSamlParserAppRuleTestBase {

    @ClassRule
    public static final DropwizardClientRule metadataClientRule;

    private static final KeyStoreResource truststore = aKeyStoreResource()
            .withCertificate("VERIFY-FEDERATION", aCertificate().withCertificate(METADATA_SIGNING_A_PUBLIC_CERT).build().getCertificate())
            .build();

    static {
        try {
            InitializationService.initialize();
            VerifySamlInitializer.init();
            metadataClientRule = new DropwizardClientRule(new TestMetadataResource());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        truststore.create();
    }

    @Rule
    public EidasSamlParserAppRule eidasSamlParserAppRule = new EidasSamlParserAppRule(
            ConfigOverride.config("proxyNodeAuthnRequestUrl", "http://proxy-node/eidasAuthnRequest"),
            ConfigOverride.config("connectorMetadataConfiguration.url", metadataClientRule.baseUri() + "/connector-node/metadata"),
            ConfigOverride.config("connectorMetadataConfiguration.expectedEntityId", TestMetadataResource.CONNECTOR_ENTITY_ID),
            ConfigOverride.config("connectorMetadataConfiguration.trustStore.type", "file"),
            ConfigOverride.config("connectorMetadataConfiguration.trustStore.store", truststore.getAbsolutePath()),
            ConfigOverride.config("connectorMetadataConfiguration.trustStore.password", truststore.getPassword())
    );

    protected Response postEidasAuthnRequest(AuthnRequest authnRequest) throws URISyntaxException {
        String eidasAuthnRequest =
            Base64.getEncoder().encodeToString(
                new SamlObjectMarshaller().transformToString(authnRequest).getBytes()
            );

        EidasSamlParserRequest request = new EidasSamlParserRequest(eidasAuthnRequest);

        return eidasSamlParserAppRule.target("/eidasAuthnRequest")
            .request(MediaType.APPLICATION_JSON_TYPE)
            .post(Entity.entity(request, MediaType.APPLICATION_JSON_TYPE));
    }

    protected Response postMalformedEidasAuthnRequest(AuthnRequest authnRequest) throws URISyntaxException {
        String eidasAuthnRequest = "not-a-base-64-encoded-xml-start-tag" + Base64.getEncoder().encodeToString(
                new SamlObjectMarshaller().transformToString(authnRequest).getBytes()
            );

        EidasSamlParserRequest request = new EidasSamlParserRequest(eidasAuthnRequest);

        return eidasSamlParserAppRule.target("/eidasAuthnRequest")
            .request(MediaType.APPLICATION_JSON_TYPE)
            .post(Entity.entity(request, MediaType.APPLICATION_JSON_TYPE));
    }
}
