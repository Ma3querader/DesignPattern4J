package com.adapter.classadapter;

/**
 * @Author: panyusheng
 * @Date: 2021/3/10
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }

    /*
     * 类适配器：
     * phone只能用5V的方法，通过中间加一个适配器，实现一个5V的接口（通过继承220V的方法，拿到220V的电压，进而转换成5V的），phone只要跟5V的接口依赖
     *
     * java单继承，如果用这种，适配器类就一定要继承方法源类，那么方法源类的所有方法都会暴露出来，但可以根据需求重写方法
     */

}
