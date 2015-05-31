package dmreshet.exceptions.templates;

import java.io.IOException;

public class MyException extends Exception {

    private Exception processException;

    public MyException(Exception processException, Exception e, String message) {
        super(message, e);
        this.processException = processException;
    }

    public MyException(IOException e, String s) {
        super(s, e);
    }
}
