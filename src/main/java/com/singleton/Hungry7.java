package com.singleton;

/**
 * @Author: panyusheng
 * @Description: 单例模式 - 懒汉式5 - 静态内部类
 * @Date: 2021/3/5
 * @Version 1.0
 */
public class Hungry7 {

    private Hungry7() {

    }

    // 静态内部类
    private static class Hungry7Instance {
        private static final Hungry7 INSTANCE = new Hungry7();
    }

    public static Hungry7 getInstance() {
        return Hungry7Instance.INSTANCE;
    }

    /*
     *  优点：调用getInstance()时才创建对象 ==> 懒加载，采用了类装载的机制来保证初始化实例时只有一个线程 ==> 线程不安全
     *        静态内部类在 Hungry7 类被装载时并不会立即实例化，而是调用getInstance() 才会被装载，类的静态属性只会在第一次加载类的时候初始化
     *        避免了线程不安全，利用静态内部类特点实现延迟加载，效率高
     */

}
