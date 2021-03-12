package com.proxy.staticproxy;

/**
 * @Author: panyusheng
 * @Date: 2021/3/12
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        TeacherDaoProxy proxy = new TeacherDaoProxy(new TeacherDao());
        proxy.teach();
    }
}
