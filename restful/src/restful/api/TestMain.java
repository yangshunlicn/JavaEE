package restful.api;

import java.lang.annotation.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

@Documented
@Inherited
@Repeatable(TestDemo.TestMains.class)
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface TestMain {
    int n();
    int nn() default 0;
    String s();
    String ss() default "中";
    String[] value() default "";
}
@TestMain(n = 0, s = "hh")
class TestDemo{
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("restful.entity.Xiao");
        TestMain[] annotation = aClass.getAnnotationsByType(TestMain.class);
        TestMain a =  annotation[0];
        String s = a.s();
        a.getClass().getName();
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        InvocationHandler invocationHandler = Proxy.getInvocationHandler(a);
        System.out.println(invocationHandler.getClass().getName());

    }
    @Documented
    @Inherited
    @Target({ElementType.METHOD,ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface TestMains {
        TestMain[] value();
    }
}
