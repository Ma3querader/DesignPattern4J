package com.decorator.decorate;

import com.decorator.Drink;

/**
 * @Author: panyusheng
 * @Date: 2021/3/11
 * @Version 1.0
 */
public class Cake extends Decorator {
    public Cake(Drink drink) {
        super(drink);
        super.setName("蛋糕");
        super.setPrice(2.5f);
    }

    @Override
    public String getName() {
        return super.drink.getName() + "和" + super.getName();
    }

}
