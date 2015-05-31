package dmreshet.reflection;

import java.lang.reflect.Array;

public class ArraysReflection {

    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, ClassNotFoundException {
        int[] intArray = (int[]) Array.newInstance(int.class, 3);

        Array.set(intArray, 0, 123);
        Array.set(intArray, 1, 456);
        Array.set(intArray, 2, 789);

        System.out.println("intArray[0] = " + Array.get(intArray, 0));
        System.out.println("intArray[1] = " + Array.get(intArray, 1));
        System.out.println("intArray[2] = " + Array.get(intArray, 2));

        Class intArray2 = Class.forName("[I");
        Class stringArrayClass = Class.forName("[Ljava.lang.String;");

        Class intClass1 = getClass("int");
//        Class intClass1 = Class.forName("I");
//        Class intClass2 = Class.forName("int");
    }

    public static Class getClass(String className) throws ClassNotFoundException {
        if ("int".equals(className)) return int.class;
        if ("long".equals(className)) return long.class;
        return Class.forName(className);
    }
}
