package singleton;

/**
 * @Author: panyusheng
 * @Description: 单例模式 - 饿汉式1 - 静态常量
 * @Date: 2021/3/5
 * @Version 1.0
 */
public class Hungry1 {

    private Hungry1() {

    }

    private static final Hungry1 HUNGRY_1 = new Hungry1();

    public static Hungry1 getInstance() {
        return HUNGRY_1;
    }

    /*
     *  优点：类装载时完成实例化，基于 classloder 机制避免了多线程的同步问题
     *  缺点：没有懒加载的效果，如果从始至终从未使用过这个实例，则会造成内存的浪费
     */

}


