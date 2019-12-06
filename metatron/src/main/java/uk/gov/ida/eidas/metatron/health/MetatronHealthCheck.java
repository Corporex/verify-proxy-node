package uk.gov.ida.eidas.metatron.health;

import com.codahale.metrics.health.HealthCheck;
import uk.gov.ida.eidas.metatron.core.dto.metadata.MetadataResolverService;

public class MetatronHealthCheck extends HealthCheck {
    private MetadataResolverService resolverService;

    public MetatronHealthCheck(MetadataResolverService resolverService) {
        this.resolverService = resolverService;
    }

    @Override
    protected Result check() {
        return Result.healthy(resolverService.getLastRefreshes());
    }
}
