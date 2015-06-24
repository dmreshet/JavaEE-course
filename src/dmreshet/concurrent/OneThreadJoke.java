package dmreshet.concurrent;

public class OneThreadJoke {
    public static void main(String[] args) {
        String str1 = "One thread is good, ";
        final String str2 = "two are better!";
        System.out.println(str1);
        for (int i = 0; i < str2.length(); i++) {
            final int j = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.print(str2.charAt(j));
                }
            }).start();
        }
    }
}
