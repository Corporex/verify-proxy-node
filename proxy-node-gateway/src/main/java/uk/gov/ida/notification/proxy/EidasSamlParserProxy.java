package uk.gov.ida.notification.proxy;

import uk.gov.ida.jerseyclient.JsonClient;
import uk.gov.ida.notification.contracts.EidasSamlParserRequest;
import uk.gov.ida.notification.contracts.EidasSamlParserResponse;
import java.net.URI;

public class EidasSamlParserProxy {
    private final JsonClient eidasSamlParserClient;
    private final URI eidasSamlParserURI;

    public EidasSamlParserProxy(
            JsonClient eidasSamlParserClient,
            URI eidasSamlParserURI) {
        this.eidasSamlParserClient = eidasSamlParserClient;
        this.eidasSamlParserURI = eidasSamlParserURI;
    }

    public EidasSamlParserResponse parse(EidasSamlParserRequest eidasSamlParserRequest) {
        return eidasSamlParserClient.post(eidasSamlParserRequest, eidasSamlParserURI, EidasSamlParserResponse.class);
    }
}