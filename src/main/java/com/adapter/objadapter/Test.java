package com.adapter.objadapter;

/**
 * @Author: panyusheng
 * @Date: 2021/3/10
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.charging(new VoltageAdapter(new Voltage220V()));
    }

    /*
     * 对象适配器：
     *     为了解决类适配器需要继承方法源类，可以直接在适配器类创建源类的引用，通过构造器传入源类，就可以调用源的方法了
     *     从泛化关系转变成聚合（或组合）关系，可通过构造器传源类（聚合）也可以直接new 源（组合），看需要决定
     */

}
