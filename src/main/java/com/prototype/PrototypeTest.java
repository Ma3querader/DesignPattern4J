package com.prototype;

/**
 * @Author: panyusheng
 * @Date: 2021/3/8
 * @Version 1.0
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] i = new int[2];
        Sheep s1 = new Sheep("多利", 1, i);
        Sheep s2 = (Sheep) s1.clone();
        System.out.println(s1.toString() + ", " + s1.getColor().hashCode());
        System.out.println(s2.toString() + ", " + s2.getColor().hashCode());
    }
}
