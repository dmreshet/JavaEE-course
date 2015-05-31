package dmreshet.exceptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FailSafeExample {

    public void test1() throws WrapperException {
        InputStream input = null;

        try {

            input = new FileInputStream("myFile.txt");

            //do something with the stream

        } catch (IOException e) {
            throw new WrapperException(e);
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                throw new WrapperException(e);
            }
        }
    }

    public void test2() throws WrapperException {
        InputStream input = null;

        try {

            input = new FileInputStream("myFile.txt");

            //do something with the stream

        } catch (IOException e) { //first catch block
            throw new WrapperException(e);
        } finally {
            try {
                if (input != null) input.close();
            } catch (IOException e) {  //second catch block
                throw new WrapperException(e);
            }
        }
    }
}
