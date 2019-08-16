package uk.gov.ida.notification.shared;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.MDC;
import uk.gov.ida.notification.shared.logging.ProxyNodeLoggingFilter;
import uk.gov.ida.notification.shared.logging.ProxyNodeMDCKey;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static uk.gov.ida.notification.shared.istio.IstioHeaders.X_B3_TRACEID;
import static uk.gov.ida.notification.shared.logging.ProxyNodeLoggingFilter.JOURNEY_ID_KEY;

@RunWith(MockitoJUnitRunner.class)
public class ProxyNodeLoggingFilterTest {

    private static final URI URI;
    private static final ProxyNodeLoggingFilter LOGGING_FILTER = new ProxyNodeLoggingFilter();

    @Mock
    private static ContainerRequestContext requestContext;

    @Mock
    private static ContainerResponseContext responseContext;

    @Mock
    private static UriInfo uriInfo;

    private static MultivaluedHashMap<String, Object> headers;

    static {
        try {
            URI = new URI("http://www.uri.com");
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @Before
    public void setUp() {
        headers = new MultivaluedHashMap<>();
        when(requestContext.getUriInfo()).thenReturn(uriInfo);
        when(uriInfo.getAbsolutePath()).thenReturn(URI);
    }

    @After
    public void after() {
        MDC.clear();
    }

    @Test
    public void shouldNotAddIstioHeaderToMdcBeforeRequestWhenNotInRequestHeaders() {
        when(requestContext.getHeaderString(X_B3_TRACEID)).thenReturn(null);
        when(requestContext.getMediaType()).thenReturn(MediaType.APPLICATION_JSON_TYPE);
        when(requestContext.getUriInfo()).thenReturn(uriInfo);

        LOGGING_FILTER.filter(requestContext);

        assertThat(MDC.getCopyOfContextMap()).doesNotContainKey(X_B3_TRACEID);
        verify(requestContext).getHeaderString(X_B3_TRACEID);
        verify(uriInfo).getAbsolutePath();
    }

    @Test
    public void shouldAddIstioHeaderToMdcBeforeRequestWhenInRequestHeaders() {
        when(requestContext.getHeaderString(X_B3_TRACEID)).thenReturn("foo");
        when(requestContext.getMediaType()).thenReturn(MediaType.APPLICATION_JSON_TYPE);

        LOGGING_FILTER.filter(requestContext);
        Map<String, String> mdcMap = MDC.getCopyOfContextMap();

        assertThat(mdcMap.get(X_B3_TRACEID)).isEqualTo("foo");
        verify(requestContext).getHeaderString(X_B3_TRACEID);
        verify(uriInfo).getAbsolutePath();
    }

    @Test
    public void shouldOnlyRemoveProxyNodeMdcKeysAndIstioHeaderAfterResponse() {
        when(requestContext.getHeaderString(JOURNEY_ID_KEY)).thenReturn("a journey id");
        when(responseContext.getMediaType()).thenReturn(MediaType.APPLICATION_JSON_TYPE);
        when(responseContext.getLocation()).thenReturn(URI);
        when(responseContext.getHeaders()).thenReturn(headers);

        MDC.put(X_B3_TRACEID, "foo");
        MDC.put(ProxyNodeMDCKey.EIDAS_REQUEST_ID.name(), "an id");
        MDC.put("some_other_key", "some value");

        LOGGING_FILTER.filter(requestContext, responseContext);
        Map<String, String> mdcMap = MDC.getCopyOfContextMap();

        assertThat(mdcMap.size()).isEqualTo(1);
        assertThat(mdcMap.get("some_other_key")).isEqualTo("some value");
        verify(requestContext).getHeaderString(JOURNEY_ID_KEY);
        verify(requestContext, never()).getProperty(JOURNEY_ID_KEY);
    }

    @Test
    public void shouldGetJourneyIdFromRequestAttributeIfNotOnHeader() {
        when(requestContext.getHeaderString(JOURNEY_ID_KEY)).thenReturn(null);
        when(requestContext.getProperty(JOURNEY_ID_KEY)).thenReturn("a journey id");
        when(responseContext.getHeaders()).thenReturn(headers);

        LOGGING_FILTER.filter(requestContext, responseContext);

        assertThat(responseContext.getHeaders().getFirst(JOURNEY_ID_KEY)).isEqualTo("a journey id");
        verify(requestContext).getHeaderString(JOURNEY_ID_KEY);
        verify(requestContext).getProperty(JOURNEY_ID_KEY);
    }

    @Test
    public void shouldSetJourneyIdOnHeadersOnResponse() {
        when(requestContext.getProperty(JOURNEY_ID_KEY)).thenReturn("a journey id");
        when(responseContext.getHeaders()).thenReturn(headers);

        LOGGING_FILTER.filter(requestContext, responseContext);

        assertThat(responseContext.getHeaders().getFirst(JOURNEY_ID_KEY)).isEqualTo("a journey id");
    }
}
