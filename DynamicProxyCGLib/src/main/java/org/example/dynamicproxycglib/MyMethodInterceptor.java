package org.example.dynamicproxycglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 方法拦截器
 */
public class MyMethodInterceptor implements MethodInterceptor {
    public Object intercept(Object o, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("拦截目标方法：" + method.getName() + "，参数：" + Arrays.deepToString(args));
        return proxy.invokeSuper(o, args);
    }
}
