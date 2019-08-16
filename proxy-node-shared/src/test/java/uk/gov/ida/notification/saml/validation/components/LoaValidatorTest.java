package uk.gov.ida.notification.saml.validation.components;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.opensaml.core.config.InitializationService;
import org.opensaml.saml.saml2.core.AuthnContext;
import org.opensaml.saml.saml2.core.AuthnContextClassRef;
import org.opensaml.saml.saml2.core.AuthnRequest;
import se.litsec.eidas.opensaml.common.EidasConstants;
import uk.gov.ida.notification.exceptions.authnrequest.InvalidAuthnRequestException;
import uk.gov.ida.notification.exceptions.hubresponse.InvalidHubResponseException;
import uk.gov.ida.notification.helpers.EidasAuthnRequestBuilder;
import uk.gov.ida.saml.core.extensions.IdaAuthnContext;
import uk.gov.ida.saml.core.test.builders.AuthnContextBuilder;
import uk.gov.ida.saml.core.test.builders.AuthnContextClassRefBuilder;

public class LoaValidatorTest {

    private static final LoaValidator LOA_VALIDATOR = new LoaValidator();

    private EidasAuthnRequestBuilder eidasAuthnRequestBuilder;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @BeforeClass
    public static void classSetup() throws Throwable {
        InitializationService.initialize();
    }

    @Before
    public void setUp() throws Throwable {
        eidasAuthnRequestBuilder = new EidasAuthnRequestBuilder();
    }

    @Test
    public void shouldNotThrowExceptionIfValidLoaRequested() throws Throwable {
        AuthnRequest request = eidasAuthnRequestBuilder.build();
        LOA_VALIDATOR.validate(request.getRequestedAuthnContext());
    }

    @Test
    public void shouldNotThrowExceptionIfLoa2Supplied() {
        final AuthnContext authnContext = anAuthnContextWithLoA(IdaAuthnContext.LEVEL_2_AUTHN_CTX);
        LOA_VALIDATOR.validate(authnContext);
    }

    @Test
    public void shouldNotThrowExceptionIfLoa1Supplied() {
        final AuthnContext authnContext = anAuthnContextWithLoA(IdaAuthnContext.LEVEL_1_AUTHN_CTX);
        LOA_VALIDATOR.validate(authnContext);
    }

    @Test
    public void shouldThrowExceptionIfNoRequestedAuthnContext() throws Throwable {
        expectedException.expect(InvalidAuthnRequestException.class);
        expectedException.expectMessage("Bad Authn Request from Connector Node: Missing RequestedAuthnContext");

        AuthnRequest request = eidasAuthnRequestBuilder.withoutRequestedAuthnContext().build();
        LOA_VALIDATOR.validate(request.getRequestedAuthnContext());
    }

    @Test
    public void shouldThrowExceptionIfNoSuppliedAuthnContext() {
        expectedException.expect(InvalidHubResponseException.class);

        LOA_VALIDATOR.validate((AuthnContext) null);
    }

    @Test
    public void shouldThrowExceptionIfNoLoARequested() throws Throwable {
        expectedException.expect(InvalidAuthnRequestException.class);
        expectedException.expectMessage("Bad Authn Request from Connector Node: Missing LoA");

        AuthnRequest request = eidasAuthnRequestBuilder.withoutLoa().build();
        LOA_VALIDATOR.validate(request.getRequestedAuthnContext());
    }

    @Test
    public void shouldThrowExceptionIfNoLoASupplied() {
        expectedException.expect(InvalidHubResponseException.class);

        LOA_VALIDATOR.validate(anAuthnContextWithLoA(null));
    }

    @Test
    public void shouldThrowExceptionIfEmptyLoARequested() throws Throwable {
        expectedException.expect(InvalidAuthnRequestException.class);
        expectedException.expectMessage("Bad Authn Request from Connector Node: Missing LoA");

        AuthnRequest request = eidasAuthnRequestBuilder.withLoa("").build();
        LOA_VALIDATOR.validate(request.getRequestedAuthnContext());
    }

    @Test
    public void shouldThrowExceptionIfEmptyLoASupplied() {
        expectedException.expect(InvalidHubResponseException.class);

        LOA_VALIDATOR.validate(anAuthnContextWithLoA(""));
    }

    @Test
    public void shouldThrowExceptionIfNonSubstantialLoA() throws Throwable {
        // we only handle substantial LoAs for now
        expectedException.expect(InvalidAuthnRequestException.class);
        expectedException.expectMessage("Bad Authn Request from Connector Node: Invalid LoA 'http://eidas.europa.eu/LoA/high'");

        AuthnRequest request = eidasAuthnRequestBuilder.withLoa(EidasConstants.EIDAS_LOA_HIGH).build();
        LOA_VALIDATOR.validate(request.getRequestedAuthnContext());
    }

    @Test
    public void shouldThrowExceptionIfInvalidLoARequested() throws Throwable {
        expectedException.expect(InvalidAuthnRequestException.class);
        expectedException.expectMessage("Bad Authn Request from Connector Node: Invalid LoA 'invalid'");

        AuthnRequest request = eidasAuthnRequestBuilder.withLoa("invalid").build();
        LOA_VALIDATOR.validate(request.getRequestedAuthnContext());
    }

    @Test
    public void shouldThrowExceptionIfLoA3Supplied() {
        expectedException.expect(InvalidHubResponseException.class);
        LOA_VALIDATOR.validate(anAuthnContextWithLoA(IdaAuthnContext.LEVEL_3_AUTHN_CTX));
    }

    @Test
    public void shouldThrowExceptionIfLoA4Supplied() {
        expectedException.expect(InvalidHubResponseException.class);
        LOA_VALIDATOR.validate(anAuthnContextWithLoA(IdaAuthnContext.LEVEL_4_AUTHN_CTX));
    }

    @Test
    public void shouldThrowExceptionIfLoAXSupplied() {
        expectedException.expect(InvalidHubResponseException.class);
        LOA_VALIDATOR.validate(anAuthnContextWithLoA(IdaAuthnContext.LEVEL_X_AUTHN_CTX));
    }

    @Test
    public void shouldThrowExceptionIfInvalidLoASupplied() {
        expectedException.expect(InvalidHubResponseException.class);
        LOA_VALIDATOR.validate(anAuthnContextWithLoA("invalid"));
    }

    private static AuthnContext anAuthnContextWithLoA(String loa) {
        final AuthnContextClassRef authnContextClassRef = AuthnContextClassRefBuilder.anAuthnContextClassRef().withAuthnContextClasRefValue(loa).build();
        return AuthnContextBuilder.anAuthnContext().withAuthnContextClassRef(authnContextClassRef).build();
    }
}
