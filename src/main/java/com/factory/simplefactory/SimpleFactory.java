package com.factory.simplefactory;

/**
 * @Author: panyusheng
 * @Description: 简单工厂
 * @Date: 2021/3/8
 * @Version 1.0
 */
public class SimpleFactory {

    public static Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊pizza");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪pizza");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒pizza");
        }
        return pizza;
    }

}
