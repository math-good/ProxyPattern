package org.example.dynamicproxyjavassist;

import javassist.util.proxy.ProxyFactory;
import javassist.util.proxy.ProxyObject;

public class Client {
    public static void main(String[] args) throws Exception {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setSuperclass(UserManager.class);
        Class<?> classes = proxyFactory.createClass();
        MyMethodHandler myMethodHandler = new MyMethodHandler();
        Object ret = classes.newInstance();
        ((ProxyObject) ret).setHandler(myMethodHandler);
        ((UserManager) ret).addUser("zhangsan");
    }
}
