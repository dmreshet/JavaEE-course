package dmreshet.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SynchronizedExample1 {
    static List<String> list = new ArrayList<String>();

    public static void main(String str[]) throws InterruptedException {
        SynchronizedExample1.list.add("test");
        SynchronizedExample1.list.add("test");

        for (Iterator it = list.iterator(); it.hasNext(); ) {
            new Thread(new Test()).start();
            Thread.sleep(100);
            it.next();
        }

    }

    public static class Test implements Runnable {
        @Override
        public void run() {
                SynchronizedExample1.list.add("test");
        }
    }
}
