package org.example.staticproxy;

/**
 * 代理类
 */
public class UserManagerProxy implements UserManager {

    private UserManager target;

    public UserManagerProxy(UserManager target) {
        this.target = target;
    }

    public void addUser(String name) {
        System.out.println("UserManagerProxy:添加用户 " + name);
        this.target.addUser(name);
    }
}
