package gov.irs;

/*
 * This is a custom application exception class, and it's CHECKED.
 */
public class IllegalWageException extends Exception {
    public IllegalWageException() {
        super();
    }

    public IllegalWageException(String message) {
        super(message);
    }

    public IllegalWageException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalWageException(Throwable cause) {
        super(cause);
    }
}