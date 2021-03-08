package com.singleton;

/**
 * @Author: panyusheng
 * @Description: 单例模式 - 懒汉式2 - 线程安全版
 * @Date: 2021/3/5
 * @Version 1.0
 */
public class Hungry4 {

    private Hungry4() {

    }

    private static Hungry4 hungry4;

    public static synchronized Hungry4 getInstance() {
        if (null == hungry4) {
            hungry4 = new Hungry4();
        }
        return hungry4;
    }

    /*
     *  优点：调用getInstance()时才创建对象 ==> 懒加载，加了同步 ==> 线程安全
     *  缺点：效率太低，每个线程执行 getInstance()方法都要进行同步。其实只要创建一次，后边直接 return 就行了。方法进行同步效率太低
     */

}
