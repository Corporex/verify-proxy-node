package uk.gov.ida.notification.saml;

import org.junit.Test;
import org.opensaml.saml.saml2.core.EncryptedAssertion;
import org.opensaml.saml.saml2.core.Response;
import org.opensaml.security.credential.BasicCredential;
import uk.gov.ida.notification.SamlInitializedTest;
import uk.gov.ida.notification.helpers.TestKeyPair;
import uk.gov.ida.saml.core.test.builders.AssertionBuilder;
import uk.gov.ida.saml.core.test.builders.ResponseBuilder;

import static org.assertj.core.api.Assertions.assertThat;

public class ResponseAssertionDecrypterTest extends SamlInitializedTest {

    @Test
    public void shouldDecryptAssertionsInResponse() throws Throwable {
        TestKeyPair testKeyPair = new TestKeyPair();
        BasicCredential credential = new BasicCredential(testKeyPair.publicKey, testKeyPair.privateKey);

        EncryptedAssertion assertion = AssertionBuilder.anAssertion()
                .withId("hi")
                .buildWithEncrypterCredential(credential);
        Response encryptedResponse = ResponseBuilder.aResponse().addEncryptedAssertion(assertion).build();

        ResponseAssertionDecrypter decrypter = new ResponseAssertionDecrypter(credential);
        Response decryptedResponse = decrypter.decrypt(encryptedResponse);

        assertThat("hi").isEqualTo(decryptedResponse.getAssertions().get(0).getID());
        assertThat(0).isEqualTo(decryptedResponse.getEncryptedAssertions().size());
    }
}
