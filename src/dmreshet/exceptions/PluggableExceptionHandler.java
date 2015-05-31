package dmreshet.exceptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class PluggableExceptionHandler {
}

interface ExceptionHandler {
    public void handle(Exception e, String errorMessage);
}

class IgnoringHandler implements ExceptionHandler {
    public void handle(Exception e, String message) {
        //do nothing, just ignore the exception
    }
}

class WrappingHandler implements ExceptionHandler {
    public void handle(Exception e, String message) {
        throw new RuntimeException(message, e);
    }
}

class CollectingHandler implements ExceptionHandler {
    List exceptions = new ArrayList();

    public List getExceptions() {
        return this.exceptions;
    }

    public void handle(Exception e, String message) {
        this.exceptions.add(e);

        //message is ignored here, but could have been
        //collected too.
    }
}

class Component {
    protected ExceptionHandler exceptionHandler = null;

    public void setExceptionHandler(ExceptionHandler handler) {
        this.exceptionHandler = handler;
    }

    public void processFile(String fileName) {
        FileInputStream input = null;
        try {
            input = new FileInputStream(fileName);
            processStream(input);
        } catch (IOException e) {
            this.exceptionHandler.handle(e,
                    "error processing file: " + fileName);
        }
    }

    protected void processStream(InputStream input)
            throws IOException {
        //do something with the stream.
    }
}
