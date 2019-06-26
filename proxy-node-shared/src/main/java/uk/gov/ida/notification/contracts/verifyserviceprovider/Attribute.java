package uk.gov.ida.notification.contracts.verifyserviceprovider;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

import javax.validation.constraints.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Attribute<T> {

    @NotNull
    @JsonProperty
    private T value;

    @NotNull
    @JsonProperty
    private boolean verified;

    @JsonProperty
    private DateTime from;

    @JsonProperty
    private DateTime to;

    @SuppressWarnings("Needed for JSON serialisation")
    public Attribute() {
    }

    public Attribute(
            T value,
            boolean verified,
            DateTime from,
            DateTime to) {
        this.value = value;
        this.verified = verified;
        this.from = from;
        this.to = to;
    }

    public T getValue() {
        return value;
    }

    public boolean isVerified() {
        return verified;
    }

    public DateTime getFrom() {
        return from;
    }

    public DateTime getTo() {
        return to;
    }


    public boolean isValid() {
        return this.verified && this.isCurrent() && this.value != null;
    }

    public boolean isCurrent() {
        return (this.from != null && this.from.isBeforeNow()) &&
                (this.to == null || this.to.isAfterNow());
    }
}
