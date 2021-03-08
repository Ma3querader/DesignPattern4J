package com.factory.factory;


/**
 * @Author: panyusheng
 * @Date: 2021/3/8
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        new LDFactory();

        /* 修改思路：如果多了地区因素，简单工厂就需要不同地区都创建一个新的，工厂类就会导致整个项目类膨胀
         *          干脆将pizza的实例化功能抽象成抽象方法， 在不同的口味点餐子类中具体实现
         *          定义了一个创建对象的抽象方法，由子类决定要实例化的类。工厂方法模式将对象的实例化推迟到子类
         */
    }
}
