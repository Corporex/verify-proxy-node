package uk.gov.ida.notification.exceptions;

import org.slf4j.MDC;
import uk.gov.ida.notification.shared.logging.ProxyNodeMDCKey;

public class SessionMissingException extends ErrorPageException {

    public SessionMissingException(String sessionId) {
        super("Session should exist for session_id: " + sessionId);
        MDC.put(ProxyNodeMDCKey.SESSION_ID.name(), sessionId);
    }
}

