package com.observer.obs;

/**
 * @Author: panyusheng
 * @Date: 2021/3/21
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        WeatherData w = new WeatherData();
        BaiduSite b = new BaiduSite();
        w.registerObserver(b);
        System.out.println("通知各个注册的观察者, 看看信息");
        w.setData(10f, 100f, 30.3f);
        w.setData(1f, 10f, 3.3f);

    }
}
