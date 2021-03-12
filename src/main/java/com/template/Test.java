package com.template;

/**
 * @Author: panyusheng
 * @Date: 2021/3/12
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("红豆口味-----------");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();
        System.out.println("花生口味-----------");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
        System.out.println("原味-----------");
        SoyaMilk plainSoyaMilk = new PlainSoyaMilk();
        plainSoyaMilk.make();
    }
}
