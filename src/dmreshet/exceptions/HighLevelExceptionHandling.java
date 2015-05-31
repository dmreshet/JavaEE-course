package dmreshet.exceptions;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class HighLevelExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Start of Test application");
        String[] array = execute();
        System.out.println(Arrays.deepToString(array));
        System.out.println("End of Test application");
    }

    private static String[] execute() {
        String path = askPathToFile();
        String content = null;
        try {
            content = openFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content.split("\\s");
    }

    private static String askPathToFile() {
        return "E:\\Dropbox\\Projects\\JavaEE\\src\\dmreshet\\exceptions\\LowLevelExceptionHandling.java";
    }

    public static String openFile(String path) throws IOException {
        try (FileReader reader = new FileReader(path)) {
            // constructor may throw FileNotFoundException
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i != -1) {
                //reader.read() may throw IOException
                i = reader.read();
                sb.append((char) i);
            }
            return sb.toString();
        }
    }
}
