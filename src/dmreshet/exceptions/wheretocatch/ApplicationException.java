package dmreshet.exceptions.wheretocatch;

public class ApplicationException extends Exception {
    public ApplicationException(String message, Exception cause) {
        super(message, cause);
    }
}
