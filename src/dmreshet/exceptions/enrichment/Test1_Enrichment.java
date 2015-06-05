package dmreshet.exceptions.enrichment;

import java.util.Random;

public class Test1_Enrichment {
    public static void main(String args[]) throws EnrichableException {
        new Test1_Enrichment().method2();
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
        if (new Random().nextInt(2) % 2 == 0) throw new EnrichableException(
                "Original error message");
    }
}
