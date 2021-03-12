package com.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: panyusheng
 * @Date: 2021/3/12
 * @Version 1.0
 */
public class ProxyFactory implements MethodInterceptor {

    private TeacherDao teacherDao;

    public ProxyFactory(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    // 返回一个代理对象
    public TeacherDao getProxyInstance() {
        // 1. 创建一个工具类
        Enhancer enhancer = new Enhancer();
        // 2. 设置父类
        enhancer.setSuperclass(teacherDao.getClass());
        // 3. 设置回调函数
        enhancer.setCallback(this);
        // 4. 创建子类对象，即代理对象
        return (TeacherDao) enhancer.create();
    }

    // 重写intercept方法，代理对象调用目标对象方法时会进行拦截（final、static 修饰的方法无法被拦截）
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib动态代理开始......");
        Object result = method.invoke(teacherDao, args);
        System.out.println("cglib动态代理提交......");
        return result;
    }
}
