package com.builder.normal;

/**
 * @Author: panyusheng
 * @Date: 2021/3/9
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        CommonHouse house = new CommonHouse();
        house.build();
        System.out.println("------------------");
        HighHouse highHouse = new HighHouse();
        highHouse.build();
    }
}
