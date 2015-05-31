package dmreshet.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@Deprecated
public class GetAnnotatedMembers {

    @MyAnnotation("test")
    public static void main(String[] args) throws NoSuchMethodException {
        Class aClass = B.class;
        Method method = aClass.getMethod("method1", null);
        Annotation[] annotations = method.getAnnotations();
        if (method.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);

            System.out.println("value: " + annotation.value());
        }

       annotations = aClass.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof MyAnnotation) {
                MyAnnotation muAnnotation = (MyAnnotation) annotation;

                System.out.println("value: " + muAnnotation.value());
            }
        }
    }

}
