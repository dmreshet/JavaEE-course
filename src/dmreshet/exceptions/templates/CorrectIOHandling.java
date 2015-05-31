package dmreshet.exceptions.templates;

import java.io.FileInputStream;
import java.io.IOException;

public class CorrectIOHandling {
    public void method1() throws MyException {
        FileInputStream input = null;
        IOException processException = null;
        String fileName = "some file name";
        try {
            input = new FileInputStream(fileName);

            //...process input stream...
        } catch (IOException e) {
            processException = e;
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    if (processException != null) {
                        throw new MyException(processException, e,
                                "Error message..." +
                                        fileName);
                    } else {
                        throw new MyException(e,
                                "Error closing InputStream for file " +
                                        fileName);
                    }
                }
            }
            if (processException != null) {
                throw new MyException(processException,
                        "Error processing InputStream for file " +
                                fileName);
            }
        }
    }
}
