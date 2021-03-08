package com.factory.simplefactory;


/**
 * @Author: panyusheng
 * @Date: 2021/3/8
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        new OrderPizza();

        /* 修改思路：修改代码可以接受，但是只要涉及创建 Pizza 的代码都需要修改，而创建 Pizza的代码会在很多地方出现
         *          把创建 Pizza 对象封装到一个类中，这样我们有新的 Pizza 种类时，只需要修改该类就可，其它有创建到 Pizza对象的代码就不需要修改了 --> 简单工厂模式
         */
    }
}
