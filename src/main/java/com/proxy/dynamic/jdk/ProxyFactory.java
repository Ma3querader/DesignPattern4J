package com.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: panyusheng
 * @Date: 2021/3/12
 * @Version 1.0
 */
public class ProxyFactory {

    private ITeacherDao iTeacherDao;

    public ProxyFactory(ITeacherDao iTeacherDao) {
        this.iTeacherDao = iTeacherDao;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(iTeacherDao.getClass().getClassLoader(), iTeacherDao.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("jdk动态代理开始......");
                Object result = method.invoke(iTeacherDao, args);
                System.out.println("jdk动态代理提交......");
                return result;
            }
        });
    }


}
