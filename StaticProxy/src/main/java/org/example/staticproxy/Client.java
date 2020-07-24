package org.example.staticproxy;

public class Client {
    public static void main(String[] args) {
        //创建目标实例
        UserManager target = new UserManagerImpl();
        //创建代理实例
        UserManagerProxy proxy = new UserManagerProxy(target);
        //调用代理方法
        proxy.addUser("zhangsan");
    }
}
