package restful.api;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
@Apple("app")
public class Hello {
    public static void main(String[] args) throws ClassNotFoundException {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Class<?> aClass = Class.forName("restful.api.Hello");
        Apple apple = aClass.getAnnotation(Apple.class);
        System.out.println(apple.getClass().getName() + "===============");
        InvocationHandler invocationHandler = Proxy.getInvocationHandler(apple);
        System.out.println(invocationHandler.getClass().getName());
    }
}
