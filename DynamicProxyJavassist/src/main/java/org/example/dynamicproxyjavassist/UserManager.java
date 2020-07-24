package org.example.dynamicproxyjavassist;

/**
 * 用户管理
 */
public class UserManager {
    void addUser(String name){
        System.out.println("UserManager:添加用户 " + name);
    }

    final void eat(){
        System.out.println("eat");
    }
}
