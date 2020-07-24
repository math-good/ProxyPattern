package org.example.dynamicproxyjdk;

public class Client {
    public static void main(String[] args) {
        //创建目标实例
        UserManager target1 = new UserManagerImpl();
        //动态代理
        UserManager proxy1 = (UserManager) new DynamicProxy().getProxy(target1);
        proxy1.addUser("zhangsan");

        System.out.println("---------------------------------------------");

        //创建目标实例
        StudentManager target2 = new StudentManagerImpl();
        //动态代理
        StudentManager proxy2 = (StudentManager) new DynamicProxy().getProxy(target2);
        proxy2.addStudent("lisi");
    }
}
