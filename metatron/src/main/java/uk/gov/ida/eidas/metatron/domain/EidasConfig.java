package uk.gov.ida.eidas.metatron.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

public class EidasConfig {
    @JsonProperty
    private List<EidasCountryConfig> countries = new ArrayList<>();

    @JsonIgnore
    private Map<String, EidasCountryConfig> countriesMap;

    public Collection<EidasCountryConfig> getCountries() {
        return countries;
    }

    public EidasCountryConfig getCountry(String country) {
        if(Objects.isNull(countriesMap)) {
            countriesMap = new HashMap<>();
            countries.stream().forEach(eidasCountryConfig -> countriesMap.put(eidasCountryConfig.getName(), eidasCountryConfig));
        }
        return countriesMap.get(country);
    }

    public void retainAll(Function<EidasConfig, Collection<EidasCountryConfig>> filterFunction) {
        this.countries.retainAll(filterFunction.apply(this));
    }
}
