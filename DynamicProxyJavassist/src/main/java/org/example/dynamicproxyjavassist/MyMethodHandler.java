package org.example.dynamicproxyjavassist;

import javassist.util.proxy.MethodHandler;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 方法拦截器
 */
public class MyMethodHandler implements MethodHandler {
    public Object invoke(Object o, Method method, Method method1, Object[] args) throws Throwable {
        System.out.println("拦截目标方法：" + method.getName() + "，参数：" + Arrays.deepToString(args));
        return method1.invoke(o, args);
    }
}
