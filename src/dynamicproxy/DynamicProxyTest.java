package dynamicproxy;

import java.lang.reflect.Proxy;

public class DynamicProxyTest {
    public static void main(String[] args) throws Throwable {

        UserService realService = new UserServiceImpl();
        UserService userService = (UserService) Proxy.newProxyInstance(
                realService.getClass().getClassLoader(),
                realService.getClass().getInterfaces(),
                new DynamicProxy(realService)
        );
        userService.outputUserName();
    }
}
