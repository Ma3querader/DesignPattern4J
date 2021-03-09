package com.builder.builder;

/**
 * @Author: panyusheng
 * @Date: 2021/3/9
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder("因特尔","金士顿").setKeyboard("黑").build();
        System.out.println(computer);
    }
}
