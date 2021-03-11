package com.decorator;

import com.decorator.coffee.Espresso;
import com.decorator.decorate.Cake;
import com.decorator.decorate.Milk;

/**
 * @Author: panyusheng
 * @Date: 2021/3/11
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Drink drink = new Espresso();
        System.out.println("点了一杯" + drink.getName() + "，价格：" + drink.cost());
        drink = new Milk(drink);
        System.out.println("点了一杯" + drink.getName() + "，价格：" + drink.cost());
        drink = new Milk(drink);
        System.out.println("点了一杯" + drink.getName() + "，价格：" + drink.cost());
        drink = new Cake(drink);
        System.out.println("点了一杯" + drink.getName() + "，价格：" + drink.cost());
    }
}
