package com.decorator.decorate;

import com.decorator.Drink;

/**
 * @Author: panyusheng
 * @Date: 2021/3/11
 * @Version 1.0
 */
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        super.setName("牛奶");
        super.setPrice(1.5f);
    }

    @Override
    public String getName() {
        return super.drink.getName() + "和" + super.getName();
    }
}
