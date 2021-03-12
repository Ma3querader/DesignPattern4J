package com.proxy.dynamic.jdk;

/**
 * @Author: panyusheng
 * @Date: 2021/3/12
 * @Version 1.0
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach(String name) {
        System.out.println("授课中......" + name);
    }
}
