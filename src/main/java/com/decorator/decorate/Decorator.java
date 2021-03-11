package com.decorator.decorate;

import com.decorator.Drink;

/**
 * @Author: panyusheng
 * @Date: 2021/3/11
 * @Version 1.0
 */
public class Decorator extends Drink {

    protected Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + this.drink.cost();
    }
}
