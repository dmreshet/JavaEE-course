package dmreshet.exceptions.wheretocatch;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ExceptionsEnrichment {

    public static void main(String[] args) {
        System.out.println("Start of Test application");
        try {
            String[] array = execute();
            System.out.println(Arrays.deepToString(array));
        } catch (ApplicationException e) {
            e.printStackTrace();
        }
        System.out.println("End of Test application");
    }

    private static String[] execute() throws ApplicationException {
        String path = askPathToFile();
        String content = openFile(path);

        return content.split("\\s");
    }

    private static String askPathToFile() {
        return "not-existing-file";
    }

    public static String openFile(String path) throws ApplicationException {
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
        } catch (IOException e) {
            throw new ApplicationException("File not found by path " + e.getMessage(), e);
        }
    }
}
