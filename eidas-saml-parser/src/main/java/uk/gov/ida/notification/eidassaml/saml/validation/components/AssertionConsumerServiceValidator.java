package uk.gov.ida.notification.eidassaml.saml.validation.components;

import com.google.common.base.Strings;
import net.shibboleth.utilities.java.support.resolver.CriteriaSet;
import net.shibboleth.utilities.java.support.resolver.ResolverException;
import org.opensaml.core.criterion.EntityIdCriterion;
import org.opensaml.saml.common.xml.SAMLConstants;
import org.opensaml.saml.metadata.resolver.MetadataResolver;
import org.opensaml.saml.saml2.core.AuthnRequest;
import org.opensaml.saml.saml2.metadata.AssertionConsumerService;
import org.opensaml.saml.saml2.metadata.EntityDescriptor;
import org.opensaml.saml.saml2.metadata.SPSSODescriptor;
import uk.gov.ida.notification.exceptions.authnrequest.InvalidAuthnRequestException;
import uk.gov.ida.notification.shared.logging.ProxyNodeLogger;

import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.stream.Collectors;

import static java.text.MessageFormat.format;

public class AssertionConsumerServiceValidator {

    private final MetadataResolver metadataResolver;

    public AssertionConsumerServiceValidator(MetadataResolver metadataResolver) {
        this.metadataResolver = metadataResolver;
    }

    public void validate(AuthnRequest request) {
        String assertionConsumerServiceURL = request.getAssertionConsumerServiceURL();

        if (Strings.isNullOrEmpty(assertionConsumerServiceURL)) {
            return;
        }

        final List<String> locationsFromMetadata = getAssertionConsumerServicesFromMetadata(request.getIssuer().getValue()).stream()
                .map(AssertionConsumerService::getLocation)
                .collect(Collectors.toList());

        if (locationsFromMetadata.stream().anyMatch(location -> location.equals(assertionConsumerServiceURL))) {
            return;
        }

        throw new InvalidAuthnRequestException("Supplied AssertionConsumerServiceURL has no match in metadata. " +
                String.format("Supplied: %s. In metadata: %s.", assertionConsumerServiceURL, String.join(", ", locationsFromMetadata)));
    }

    private Collection<AssertionConsumerService> getAssertionConsumerServicesFromMetadata(String entityId) {
        try {
            EntityIdCriterion entityIdCriterion = new EntityIdCriterion(entityId);
            EntityDescriptor metadata = metadataResolver.resolveSingle(new CriteriaSet(entityIdCriterion));

            if (metadata == null) {
                return List.of();
            }

            SPSSODescriptor spssoDescriptor = metadata.getSPSSODescriptor(SAMLConstants.SAML20P_NS);

            if (spssoDescriptor == null) {
                return List.of();
            }

            return spssoDescriptor.getAssertionConsumerServices();
        } catch (ResolverException e) {
            ProxyNodeLogger.logException(e, Level.WARNING, format("Unable to resolve metadata for entity {0}", entityId));
            return List.of();
        }
    }
}
