package com.bridge.color;

/**
 * @Author: panyusheng
 * @Date: 2021/3/10
 * @Version 1.0
 */
public class White implements Color {
    @Override
    public void paint(String shape) {
        System.out.println("白色的" + shape);
    }
}
