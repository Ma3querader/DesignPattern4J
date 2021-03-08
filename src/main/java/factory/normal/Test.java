package factory.normal;

/**
 * @Author: panyusheng
 * @Date: 2021/3/8
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        new OrderPizza();

        /* 违反了设计模式的 ocp（开闭） 原则，即对扩展开放，对修改关闭。即当我们给类增加新功能的时候，尽量不修改代码，或者尽可能少修改代码
         * 如果添加pizza种类，下单类的if块也要跟着改，耦合太高
         */
    }
}
