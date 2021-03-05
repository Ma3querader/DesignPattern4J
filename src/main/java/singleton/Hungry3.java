package singleton;

/**
 * @Author: panyusheng
 * @Description: 单例模式 - 懒汉式1 - 线程不安全版
 * @Date: 2021/3/5
 * @Version 1.0
 */
public class Hungry3 {

    private Hungry3() {

    }

    private static Hungry3 hungry3;

    public static Hungry3 getInstance() {
        if (null == hungry3) {
            hungry3 = new Hungry3();
        }
        return hungry3;
    }

    /*
     *  优点：调用getInstance()时才创建对象 ==> 懒加载
     *  缺点：线程不安全，多个线程同时进入到if块会产生多个对象
     */

}
