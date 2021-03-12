package com.proxy.dynamic.cglib;

/**
 * @Author: panyusheng
 * @Date: 2021/3/12
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        ProxyFactory factory = new ProxyFactory(teacherDao);
        TeacherDao proxy = factory.getProxyInstance();
        String teach = proxy.teach();
        System.out.println(teach);
    }
}
