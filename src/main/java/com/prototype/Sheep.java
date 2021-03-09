package com.prototype;

import java.io.*;
import java.util.Arrays;

/**
 * @Author: panyusheng
 * @Date: 2021/3/8
 * @Version 1.0
 */
public class Sheep implements Cloneable, Serializable {
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
        // 创建字节数组流和对象流
        ByteArrayOutputStream bos = null;
        ByteArrayInputStream bis = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            // 序列化
            bos = new ByteArrayOutputStream();  // 数据即将写入的字节数组输出流
            oos = new ObjectOutputStream(bos);  // 创建一个写入bos的对象输出流
            oos.writeObject(this);              // 将this对象写入oos
            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());  // 创建一个 bis ，使用 bos作为缓冲区
            ois = new ObjectInputStream(bis);   // 创建一个从bis读取的对象输入流
            return ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            // 关闭流
            try {
                ois.close();
                bis.close();
                oos.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
