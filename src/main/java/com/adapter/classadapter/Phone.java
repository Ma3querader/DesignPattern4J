package com.adapter.classadapter;

/**
 * @Author: panyusheng
 * @Date: 2021/3/10
 * @Version 1.0
 */
public class Phone {
    public void charging(Voltage5V v) {
        if (v.output5V() == 5) {
            System.out.println("手机正常充电");
        }
    }

}
