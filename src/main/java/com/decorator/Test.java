package com.decorator;

import com.decorator.coffee.Espresso;
import com.decorator.decorate.Cake;
import com.decorator.decorate.Milk;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @Author: panyusheng
 * @Date: 2021/3/11
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Drink drink = new Espresso();
        System.out.println("点了一杯" + drink.getName() + "，价格：" + drink.cost());
        drink = new Milk(drink);
        System.out.println("点了一杯" + drink.getName() + "，价格：" + drink.cost());
        drink = new Milk(drink);
        System.out.println("点了一杯" + drink.getName() + "，价格：" + drink.cost());
        drink = new Cake(drink);
        System.out.println("点了一杯" + drink.getName() + "，价格：" + drink.cost());


        long begin = System.currentTimeMillis();
        InputStream in = new FileInputStream("D:\\abc.txt");
        byte[] b = new byte[1024];
        StringBuffer str = new StringBuffer();
        int len;
        while ((len = in.read(b)) != -1) {
            str.append(new String(b, 0, len));
        }
        long end = System.currentTimeMillis();
        System.out.println("使用fileinputstream读：" + (end - begin) + "毫秒");
        in.close();
        System.out.println("关闭input流---------------------");

        long begin1 = System.currentTimeMillis();
        InputStream bis = new BufferedInputStream(new FileInputStream("D:\\abc.txt"));
        byte[] b1 = new byte[1024];
        StringBuffer str1 = new StringBuffer();
        int len1;
        while ((len1 = bis.read(b1)) != -1) {
            str1.append(new String(b1, 0, len1));
        }
        long end1 = System.currentTimeMillis();
        System.out.println("使用bufferedinputstream读：" + (end1 - begin1) + "毫秒");
        bis.close();
        System.out.println("关闭buffered流---------------------");

    }
}
