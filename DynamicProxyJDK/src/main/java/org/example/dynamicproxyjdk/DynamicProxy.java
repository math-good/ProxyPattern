package org.example.dynamicproxyjdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * 动态代理类
 */
public class DynamicProxy implements InvocationHandler {

    private Object target;

    public Object getProxy(Object target) {
        if (target == null) {
            throw new NullPointerException();
        }
        this.target = target;
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理执行方法： " + method.getName() + "，参数： " + Arrays.deepToString(args));
        return method.invoke(this.target, args);
    }
}
