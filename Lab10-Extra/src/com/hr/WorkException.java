package com.hr;

/*
 * This is a more HR-oriented, higher-level exception type
 * than this other low-level transportation-oriented DestinationUnreachableException.
 */
public class WorkException extends Exception {
    public WorkException() {
        super();
    }

    public WorkException(String message) {
        super(message);
    }

    public WorkException(String message, Throwable cause) {
        super(message, cause);
    }

    public WorkException(Throwable cause) {
        super(cause);
    }
}