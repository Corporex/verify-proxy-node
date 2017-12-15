package uk.gov.ida.notification;

import io.dropwizard.Application;
import io.dropwizard.configuration.EnvironmentVariableSubstitutor;
import io.dropwizard.configuration.SubstitutingSourceProvider;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;
import org.opensaml.core.config.InitializationException;
import org.opensaml.core.config.InitializationService;
import uk.gov.ida.notification.pki.KeyPairConfigurationCredentialBuilder;
import uk.gov.ida.notification.pki.SigningCredential;
import uk.gov.ida.notification.resources.EidasAuthnRequestResource;
import uk.gov.ida.notification.resources.HubMetadataResource;
import uk.gov.ida.notification.resources.HubResponseResource;
import uk.gov.ida.notification.saml.SamlObjectSigner;
import uk.gov.ida.notification.saml.SamlParser;
import uk.gov.ida.notification.saml.converters.AuthnRequestParameterProvider;
import uk.gov.ida.notification.saml.converters.ResponseParameterProvider;
import uk.gov.ida.notification.saml.translation.EidasAuthnRequestTranslator;
import uk.gov.ida.notification.saml.translation.HubResponseTranslator;
import uk.gov.ida.stubs.resources.StubConnectorNodeResource;
import uk.gov.ida.stubs.resources.StubIdpResource;

import javax.xml.parsers.ParserConfigurationException;

public class EidasProxyNodeApplication extends Application<EidasProxyNodeConfiguration> {

    @SuppressWarnings("WeakerAccess") // Needed for DropwizardAppRules
    public EidasProxyNodeApplication() {
    }

    public static void main(final String[] args) throws Exception {
        if (args == null || args.length == 0) {
            String configFile = System.getenv("CONFIG_FILE");

            if (configFile == null) {
                throw new RuntimeException("CONFIG_FILE environment variable should be set with path to configuration file");
            }

            new EidasProxyNodeApplication().run("server", configFile);
        } else {
            new EidasProxyNodeApplication().run(args);
        }
    }

    @Override
    public String getName() {
        return "EidasProxyNode";
    }

    @Override
    public void initialize(final Bootstrap<EidasProxyNodeConfiguration> bootstrap) {
        // Needed to correctly interpolate environment variables in config file
        bootstrap.setConfigurationSourceProvider(
                new SubstitutingSourceProvider(bootstrap.getConfigurationSourceProvider(),
                        new EnvironmentVariableSubstitutor(false)
                )
        );

        // Needed to initialise OpenSAML libraries
        // The eidas-opensaml3 library provides its own initializer that will be executed
        // by the InitializationService
        try {
            InitializationService.initialize();
        } catch(InitializationException e) {
            throw new RuntimeException(e);
        }

        // Views
        bootstrap.addBundle(new ViewBundle<>());
    }

    @Override
    public void run(final EidasProxyNodeConfiguration configuration,
                    final Environment environment) throws ParserConfigurationException {
        String connectorNodeUrl = configuration.getConnectorNodeUrl().toString();
        SamlParser samlParser = new SamlParser();
        HubResponseTranslator hubResponseTranslator = new HubResponseTranslator(
                configuration.getProxyNodeEntityId(),
                connectorNodeUrl
        );
        EidasAuthnRequestTranslator eidasAuthnRequestTranslator = new EidasAuthnRequestTranslator(
                configuration.getProxyNodeEntityId(),
                configuration.getHubUrl().toString());
        KeyPairConfigurationCredentialBuilder credentialBuilder = new KeyPairConfigurationCredentialBuilder();
        SigningCredential hubFacingSigningCredential = credentialBuilder.buildSigningCredential(configuration.getHubFacingSigningKeyPair());
        SamlObjectSigner hubAuthnRequestSigner = new SamlObjectSigner(hubFacingSigningCredential);
        HubAuthnRequestGenerator hubAuthnRequestGenerator = new HubAuthnRequestGenerator(
                eidasAuthnRequestTranslator,
                hubAuthnRequestSigner);
        SamlFormViewBuilder samlFormViewBuilder = new SamlFormViewBuilder();

        environment.jersey().register(AuthnRequestParameterProvider.class);
        environment.jersey().register(ResponseParameterProvider.class);
        environment.jersey().register(new EidasAuthnRequestResource(
                configuration,
                hubAuthnRequestGenerator,
                samlFormViewBuilder
        ));
        environment.jersey().register(new HubResponseResource(hubResponseTranslator, samlFormViewBuilder, connectorNodeUrl));
        environment.jersey().register(new HubMetadataResource());
        environment.jersey().register(new StubConnectorNodeResource());
        environment.jersey().register(new StubIdpResource());
    }
}
