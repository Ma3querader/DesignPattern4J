package com.prototype;

import org.springframework.util.SerializationUtils;

/**
 * @Author: panyusheng
 * @Date: 2021/3/8
 * @Version 1.0
 */
public class Normal {
    public static void main(String[] args) {
        int[] i = new int[2];
        Sheep s1 = new Sheep("多利", 1, i);
        Sheep s2 = new Sheep(s1.getName(), s1.getAge(), s1.getColor());
        System.out.println(s1.toString() + ", " + s1.getColor().hashCode());
        System.out.println(s2.toString() + ", " + s2.getColor().hashCode());
    }
}
