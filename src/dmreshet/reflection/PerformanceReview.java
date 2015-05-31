package dmreshet.reflection;


import dmreshet.Timer;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PerformanceReview {
    public static long LOOPS_IN_STEP_COUNT = 10000000;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Timer t = new Timer();
        t.start("Direct field access");
        for (int i = 0; i < LOOPS_IN_STEP_COUNT; ++i) {
            new A().value += i;
        }
        System.out.println(t.stop());

        A a = new A();
        t.start("Preparing for reflective field access");
        Field f = A.class.getField("value");
        System.out.println(t.stop());

        t.start("Reflective field access");
        for (int i = 0; i < LOOPS_IN_STEP_COUNT; ++i) {
            f.set(a, ((Integer) f.get(a)) + i);
        }
        System.out.println(t.stop());

        a = new A();
        t.start("Direct method access");
        for (int i = 0; i < LOOPS_IN_STEP_COUNT; ++i) {
            a.add(i);
        }
        System.out.println(t.stop());

        t.start("Preparing for reflective method access");
        Method m = A.class.getDeclaredMethod("add", int.class);
        System.out.println(t.stop());

        t.start("Reflective method access");
        for (int i = 0; i < LOOPS_IN_STEP_COUNT; ++i) {
            m.invoke(a, i);
        }
        System.out.println(t.stop());
    }

    static class A {
        public int value = 0;

        public void add(int x) {
            value += x;
        }
    }
}
