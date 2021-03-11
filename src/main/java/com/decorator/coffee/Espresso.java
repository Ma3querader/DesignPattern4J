package com.decorator.coffee;

import com.decorator.Drink;

/**
 * @Author: panyusheng
 * @Date: 2021/3/11
 * @Version 1.0
 */
public class Espresso extends Drink {

    public Espresso() {
        super.setName("意大利咖啡");
        super.setPrice(5);
    }

    @Override
    public float cost() {
        return this.getPrice();
    }
}
