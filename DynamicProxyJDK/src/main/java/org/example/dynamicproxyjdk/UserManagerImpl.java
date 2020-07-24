package org.example.dynamicproxyjdk;

/**
 * 具体实现
 */
public class UserManagerImpl implements UserManager {
    public void addUser(String name) {
        System.out.println("UserManagerImpl:添加用户 " + name);
    }
}
