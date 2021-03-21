package com.observer.normal;

/**
 * @Author: panyusheng
 * @Date: 2021/3/21
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        CurrentConditions c = new CurrentConditions();
        WeatherData w = new WeatherData(c);
        w.setData(2, 3,4);
        System.out.println("=========  天气改变  ==========");
        w.setData(5, 6,7);
    }
}
