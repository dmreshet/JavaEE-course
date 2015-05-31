package dmreshet.exceptions;

import java.io.IOException;

public class WrapperException extends Exception {
    public WrapperException(IOException e) {
        super(e);
    }
}
