package org.example.dynamicproxyjdk;

/**
 * 学生管理具体实现
 */
public class StudentManagerImpl implements StudentManager {
    public void addStudent(String name) {
        System.out.println("StudentManagerImpl:添加学生 " + name);
    }
}
