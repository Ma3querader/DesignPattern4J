package com.facade;

/**
 * @Author: panyusheng
 * @Date: 2021/3/11
 * @Version 1.0
 */
public class Projector {

    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" Projector on ");
    }

    public void off() {
        System.out.println(" Projector ff ");
    }

    public void focus() {
        System.out.println(" Projector is Projector	");
    }


}
