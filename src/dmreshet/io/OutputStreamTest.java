package dmreshet.io;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest {
    public static void main(String[] args) throws InterruptedException {
        OutputStream fos = null;
        try {
            fos = new ByteOutputStream();
            for (int i = 0; i < 10; i++) {
                fos.write(i);
                Thread.sleep(1000);
            }
            fos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    class Test implements Runnable{
        private final OutputStream os;

        public Test(OutputStream os) {
            this.os = os;
        }

        @Override
        public void run() {
//            InputStream fis = null;
//            try {
////                fis = new ByteInputStream(os.);
////                fis.
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
        }
    }
}
