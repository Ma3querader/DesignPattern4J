package com.factory.abstractfactory;

/**
 * @Author: panyusheng
 * @Date: 2021/3/8
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        new OrderPizza(new BJFactory());


        /* 抽象工厂模式
         *     可以将简单工厂模式和工厂方法模式进行整合，从设计层面看，抽象工厂模式就是对简单工厂模式的改进(或者称为进一步的抽象)
         * 将工厂抽象成两层，AbsFactory(抽象工厂) 和 具体实现的工厂子类。根据创建对象类型使用对应的工厂子类。这样将单个的简单工厂类变成了工厂簇，更利于代码的维护和扩展
         */
    }
}
