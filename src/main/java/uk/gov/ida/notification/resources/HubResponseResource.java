package uk.gov.ida.notification.resources;

import io.dropwizard.views.View;
import org.glassfish.jersey.internal.util.Base64;
import uk.gov.ida.notification.EidasProxyNodeConfiguration;
import uk.gov.ida.notification.saml.SamlMessageType;
import uk.gov.ida.notification.saml.translation.HubResponseTranslator;
import uk.gov.ida.notification.views.SamlFormView;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/SAML2/Response")
public class HubResponseResource {
    private final String connectorNodeUrl;
    private final String SUBMIT_TEXT = "Post eIDAS Response SAML to Connector Node";
    private HubResponseTranslator hubResponseTranslator;

    public HubResponseResource(EidasProxyNodeConfiguration configuration, HubResponseTranslator hubResponseTranslator) {
        this.connectorNodeUrl = configuration.getConnectorNodeUrl().toString();
        this.hubResponseTranslator = hubResponseTranslator;
    }

    @POST
    @Path("/POST")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public View hubResponse(@FormParam(SamlMessageType.SAML_RESPONSE) String encodedHubResponse) {
        String hubResponseSamlString = Base64.decodeAsString(encodedHubResponse);
        String eidasSamlString = hubResponseTranslator.translate(hubResponseSamlString);
        String encodedEidasResponse = Base64.encodeAsString(eidasSamlString);
        return new SamlFormView(connectorNodeUrl, SamlMessageType.SAML_RESPONSE, encodedEidasResponse, SUBMIT_TEXT);
    }
}