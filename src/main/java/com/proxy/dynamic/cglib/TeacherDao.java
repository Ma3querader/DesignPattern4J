package com.proxy.dynamic.cglib;

/**
 * @Author: panyusheng
 * @Date: 2021/3/12
 * @Version 1.0
 */
public class TeacherDao {
    public String teach() {
        System.out.println(" 老师授课中	， 我是 cglib 代理，不需要实现接口 ");
        return "hello";
    }
}
