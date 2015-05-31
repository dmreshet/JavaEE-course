package dmreshet.reflection;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface MyInterface {
    public String getName(String prefix);
    public void setName(String name);
}

class TestImpl implements MyInterface {

    private String name = "TestImpl";

    public String getName(String prefix) {
        return prefix + name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class MyInvocationHandler implements InvocationHandler {

    private MyInterface proxied;

    public MyInvocationHandler(MyInterface proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(proxied, ">> ");
    }
}

public class ReflectionProxy {
    public static void main(String args[]) {

        MyInterface proxied = new TestImpl();
        MyInterface test = (MyInterface) Proxy.newProxyInstance(
                TestImpl.class.getClassLoader(),
                new Class[]{ MyInterface.class },
                new MyInvocationHandler(proxied)
        );

        System.out.println(proxied.getName("name: "));
        System.out.println(test.getName("name: "));

        proxied.setName("new ProxyName");
        System.out.println("\nname changed\n");

        System.out.println(proxied.getName("name: "));
        System.out.println(test.getName("name: "));

    }
}