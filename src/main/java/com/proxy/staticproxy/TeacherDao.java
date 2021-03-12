package com.proxy.staticproxy;

/**
 * @Author: panyusheng
 * @Date: 2021/3/12
 * @Version 1.0
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("教课中......");
    }
}
