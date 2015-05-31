package dmreshet.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PrivateFieldAccess {
    public static void main(String[] args) throws Exception {
        PrivateObject privateObject = new PrivateObject("The Private Value");

        Field privateStringField = PrivateObject.class.getDeclaredField("privateString");

        privateStringField.setAccessible(true);

        String fieldValue = (String) privateStringField.get(privateObject);
        System.out.println("fieldValue = " + fieldValue);


        Method privateStringMethod = PrivateObject.class.
                getDeclaredMethod("getPrivateString", null);

        privateStringMethod.setAccessible(true);

        String returnValue = (String)
                privateStringMethod.invoke(privateObject, null);

        System.out.println("returnValue = " + returnValue);

    }

    static public class PrivateObject {

        private String privateString = null;

        private String getPrivateString(){
            return this.privateString;
        }

        public PrivateObject(String privateString) {
            this.privateString = privateString;
        }
    }
}
