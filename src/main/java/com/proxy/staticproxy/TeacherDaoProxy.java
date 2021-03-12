package com.proxy.staticproxy;

/**
 * @Author: panyusheng
 * @Date: 2021/3/12
 * @Version 1.0
 */
public class TeacherDaoProxy implements ITeacherDao {

    private TeacherDao teacherDao;

    public TeacherDaoProxy(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public void teach() {
        System.out.println("静态代理......");
        this.teacherDao.teach();
    }


}
