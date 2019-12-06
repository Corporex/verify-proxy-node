package uk.gov.ida.eidas.metatron.core.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.net.URI;
import java.security.KeyStore;
import java.util.Collection;

public class EidasCountryConfig {

    @JsonProperty
    @Valid
    @NotNull
    private String name;
    @JsonProperty
    @Valid
    @NotNull
    private String countryCode;
    @JsonProperty
    @Valid
    @NotNull
    private URI connectorMetadata;
    @JsonProperty
    @Valid
    @NotNull
    private boolean enabled;
    @JsonProperty
    private KeyStore metadataTruststore;
    @JsonProperty
    private KeyStore tlsTruststore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonIgnore
    public String getEntityId() {
        return connectorMetadata.toString();
    }

    public URI getConnectorMetadata() {
        return connectorMetadata;
    }

    public void setConnectorMetadata(URI connectorMetadata) {
        this.connectorMetadata = connectorMetadata;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setMetadataTruststore(KeyStore metadataTruststore) {
        this.metadataTruststore = metadataTruststore;
    }

    public KeyStore getMetadataTruststore() {
        return this.metadataTruststore;
    }

    public void setTlsTruststore(KeyStore tlsTruststore) {
        this.tlsTruststore = tlsTruststore;
    }

    public KeyStore getTlsTruststore() {
        return this.tlsTruststore;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("<table>");
        stringBuffer
                .append("<tr>")
                .append("<td>name:</td><td>").append(getName()).append("</td>")
                .append("</tr>")
                .append("<tr>")
                .append("<td>country code:</td><td>").append(getCountryCode()).append("</td>")
                .append("</tr>")
                .append("<tr>")
                .append("<td>metadata url:</td><td>").append(href(getConnectorMetadata().toString())).append("</td>")
                .append("</tr>")
                .append("<tr>")
                .append("<td>entity id:</td><td>").append(href(getEntityId())).append("</td>")
                .append("</tr>")
                .append("</table>");
        return stringBuffer.toString();
    }
    private String href(String url) {
        return "<a href='" + url + "'>" + url + "</a>";
    }
}
