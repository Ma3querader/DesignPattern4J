package com.mediator;

/**
 * @Author: panyusheng
 * @Date: 2021/3/21
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        ConcreteMediator cm = new ConcreteMediator();
        Alarm a = new Alarm(cm, "alarm");
        a.SendMessage(0);
    }
}
