package uk.gov.ida.eidas.metatron.domain;

import net.shibboleth.utilities.java.support.resolver.CriteriaSet;
import net.shibboleth.utilities.java.support.resolver.ResolverException;
import org.glassfish.jersey.client.JerseyClientBuilder;
import org.opensaml.core.criterion.EntityIdCriterion;
import org.opensaml.saml.metadata.resolver.MetadataResolver;
import org.opensaml.saml.metadata.resolver.filter.MetadataFilter;
import org.opensaml.saml.metadata.resolver.impl.AbstractReloadingMetadataResolver;
import org.opensaml.saml.saml2.metadata.EntityDescriptor;
import uk.gov.ida.saml.metadata.ExpiredCertificateMetadataFilter;
import uk.gov.ida.saml.metadata.PKIXSignatureValidationFilterProvider;
import uk.gov.ida.saml.metadata.factories.MetadataResolverFactory;

import javax.ws.rs.client.Client;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MetadataResolverService {

    private static long MIN_REFRESH_DELAY_MS = 60_000;
    private static long MAX_REFRESH_DELAY_MS = 600_000;

    private Map<String, MetadataResolver> metadataResolverMap;
    private EidasConfig config;
    private ExpiredCertificateMetadataFilter expiredCertificateMetadataFilter;
    private MetadataResolverFactory metadataResolverFactory;

    public MetadataResolverService(EidasConfig countriesConfig) {
        this.metadataResolverFactory = new MetadataResolverFactory();
        this.config = countriesConfig;
        this.metadataResolverMap = new HashMap<>();
        this.expiredCertificateMetadataFilter = new ExpiredCertificateMetadataFilter();

        countriesConfig.getCountries().forEach(country -> {
                    metadataResolverMap.put(country.getName(), getMetadataResolver(country));
                }
        );
    }

    public String getEntityId(String country) throws ResolverException {
        // Obviously, this doesn't make much sense given that we have to know the entity id to start with ...
        String entityId = config.getCountry(country).getEntityId();
        CriteriaSet criteria = new CriteriaSet(new EntityIdCriterion(entityId));
        EntityDescriptor entityDescriptor = this.metadataResolverMap.get(country).resolveSingle(criteria);
        return entityDescriptor.getEntityID();
    }

    public String getLastRefreshes() {
        final StringBuffer stringBuffer = new StringBuffer();
        this.metadataResolverMap.keySet().stream()
                .forEach(country ->
                        stringBuffer
                                .append(country)
                                .append(" last refreshed: ")
                                .append(((AbstractReloadingMetadataResolver) this.metadataResolverMap.get(country)).getLastRefresh())
                                .append(" | ")
                );
        return stringBuffer.toString();
    }

    private Client getClient(EidasCountryConfig country) {
        if (Objects.isNull(country.getTlsTruststore())) {
            return JerseyClientBuilder.newClient();
        } else {
            return JerseyClientBuilder.newBuilder().trustStore(country.getTlsTruststore()).build();
        }
    }

    private List<MetadataFilter> getFilters(EidasCountryConfig country) {
        List<MetadataFilter> filters = new ArrayList<>();
        filters.add(new PKIXSignatureValidationFilterProvider(country.getMetadataTruststore()).get());
        filters.add(expiredCertificateMetadataFilter);

        return filters;
    }

    private MetadataResolver getMetadataResolver(EidasCountryConfig country) {
        return this.metadataResolverFactory.create(
                getClient(country),
                country.getConnectorMetadata(),
                getFilters(country),
                MIN_REFRESH_DELAY_MS,
                MAX_REFRESH_DELAY_MS);
    }
}

