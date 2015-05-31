package dmreshet.exceptions.templates;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InterfaceTemplate {

    public static void main(String[] args) {
        try {
            new InputStreamProcessingTemplate2()
                    .process("someFile.txt", new InputStreamProcessor() {
                        public void process(InputStream input) throws IOException {
                            int inChar = input.read();
                            while (inChar != -1) {
                                //do something with the chars...
                            }
                        }
                    });
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}



interface InputStreamProcessor {
    public void process(InputStream input) throws IOException;
}


class InputStreamProcessingTemplate2 {

    public void process(String fileName, InputStreamProcessor processor) throws MyException {
        IOException processException = null;
        InputStream input = null;
        try {
            input = new FileInputStream(fileName);

            processor.process(input);
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
