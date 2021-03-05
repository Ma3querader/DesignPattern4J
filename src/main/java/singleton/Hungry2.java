package singleton;

/**
 * @Author: panyusheng
 * @Description: 单例模式 - 饿汉式2 - 静态代码块
 * @Date: 2021/3/5
 * @Version 1.0
 */
public class Hungry2 {

    private Hungry2() {

    }

    private static Hungry2 HUNGRY_2;

    static {
        HUNGRY_2 = new Hungry2();
    }

    public static Hungry2 getInstance() {
        return HUNGRY_2;
    }

    /*
     *  优点：将类实例化的过程放在了静态代码块，类装载时完成实例化，基于 classloder 机制避免了多线程的同步问题
     *  缺点：没有懒加载的效果，如果从始至终从未使用过这个实例，则会造成内存的浪费
     */

}
