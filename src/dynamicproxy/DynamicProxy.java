package dynamicproxy;

import com.sun.deploy.net.proxy.ProxyHandler;
import org.omg.CORBA.portable.InvokeHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

    private Object subject;

    public DynamicProxy(Object object) {
        this.subject = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Hello");
        Object object = method.invoke(this.subject, args);
        System.out.println("World");
        return object;
    }
}
