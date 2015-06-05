package dmreshet.exceptions.enrichment;

import java.util.Arrays;

public class Test2_ErrorCodes {

    public static void main(String args[]) throws EnrichableException {
        try {
            new Test2_ErrorCodes().method2();
        } catch (EnrichableException e) {
            System.out.println(Arrays.deepToString(e.infoList.toArray()) + e.errorCodeMap);
        }
    }

    public void method3() throws EnrichableException {
        try {
            method1();
        } catch (EnrichableException e) {
            e.addInfo("An error occurred when trying to ...");
            throw e;
        }
    }

    public void method2() throws EnrichableException {
        try {
            method1();
        } catch (EnrichableException e) {
            e.addInfo("An error occurred when trying to ...");
            throw e;
        }
    }

    public void method1() throws EnrichableException {
        if (true) throw new EnrichableException(
                "ERROR1", "Original error message");
    }
}
