package dmreshet.exceptions.enrichment.ideal;

public interface ExceptionHandler {
    void handle(String errorContext, String errorCode,
                String errorText, Throwable t);

    void raise(String errorContext, String errorCode,
               String errorText);
}
