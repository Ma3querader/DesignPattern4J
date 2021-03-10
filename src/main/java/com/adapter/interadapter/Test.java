package com.adapter.interadapter;

/**
 * @Author: panyusheng
 * @Date: 2021/3/10
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.charging(new AbsAdapter() {
            @Override
            public int output5V() {
                return super.output5V();
            }
        });
    }

    /*
     * 接口适配器：
     *     当不需要全部实现接口提供的方法时，可先设计一个抽象类实现接口，并为该接口中每个方法提供一个默认实现（空方法），那么该抽象类的子类可有选择地覆盖父类的某些方法来实现需求
     */

}
