package com.prototype;

import java.io.*;
import java.util.Arrays;

/**
 * @Author: panyusheng
 * @Date: 2021/3/8
 * @Version 1.0
 */
public class Sheep implements Cloneable {
    private String name;
    private int age;
    private int[] color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getColor() {
        return color;
    }

    public void setColor(int[] color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color=" + Arrays.toString(color) +
                '}';
    }

    public Sheep(String name, int age, int[] color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
