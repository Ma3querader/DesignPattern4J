package com.singleton;

/**
 * @Author: panyusheng
 * @Description: 单例模式 - 懒汉式3 - 线程不安全
 * @Date: 2021/3/5
 * @Version 1.0
 */
public class Hungry5 {

    private Hungry5() {

    }

    private static Hungry5 hungry5;

    public static Hungry5 getInstance() {
        if (null == hungry5) {
            synchronized (Hungry5.class) {
                hungry5 = new Hungry5();
            }
        }
        return hungry5;
    }

    /*
     *  优点：调用getInstance()时才创建对象 ==> 懒加载，线程不安全
     *  缺点：把 synchronized 从方法级别降到块级别，但多个线程同时进入到if块会产生多个对象
     */

}
