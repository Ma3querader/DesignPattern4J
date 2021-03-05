package singleton;

/**
 * @Author: panyusheng
 * @Description: 单例模式 - 懒汉式4 - 双重检查
 * @Date: 2021/3/5
 * @Version 1.0
 */
public class Hungry6 {

    private Hungry6() {

    }

    private static volatile Hungry6 hungry6;

    public static Hungry6 getInstance() {
        if (null == hungry6) {
            synchronized (Hungry6.class) {
                if (null == hungry6) {
                    hungry6 = new Hungry6();
                }
            }
        }
        return hungry6;
    }

    /*
     *  优点：调用getInstance()时才创建对象 ==> 懒加载，同步块 ==> 线程安全，线程进入同步块前后各做一次if，避免反复进行方法同步，实例化也只会做一次
     *        线程安全、延迟加载、效率较高
     *        volatile 保证了 new 的时候指令不会重排序
     *        创建对象过程：1.加载class对象 2.分配内存空间，初始化实例 3.调用构造函数 4.返回地址给引用
     *        如果cpu优化程序，重排了指令（先返回地址再分配内存），可能出现调用对象时还没有初始化完成
     *  缺点：暂无发现
     */

}
