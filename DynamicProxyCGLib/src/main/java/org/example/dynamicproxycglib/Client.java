package org.example.dynamicproxycglib;

import net.sf.cglib.proxy.Enhancer;

public class Client {
    public static void main(String[] args) {
        //调试方式，生成class文件
//        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "C:\\Users\\admin\\IdeaProjects\\ProxyPattern\\DynamicProxyCGLib\\DebuggingClassWriter");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserManager.class);
        enhancer.setCallback(new MyMethodInterceptor());

        UserManager userManager = (UserManager) enhancer.create();
        userManager.addUser("zhangsan");

        //final方法不会执行方法拦截器会直接调用目标类
        userManager.eat();
    }
}
