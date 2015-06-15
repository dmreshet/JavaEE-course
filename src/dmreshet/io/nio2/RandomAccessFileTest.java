package dmreshet.io.nio2;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

    public static void main(String[] args) throws IOException {
        RandomAccessFile aFile = new RandomAccessFile("test", "rw");
        aFile.seek(3);
        aFile.write(55);
        System.out.println(aFile.read());
        aFile.close();
    }
}
