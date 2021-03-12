package com.flyweight;

/**
 * @Author: panyusheng
 * @Date: 2021/3/12
 * @Version 1.0
 */
public class ConcreteWebSite extends WebSite {

    private String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    void use() {
        System.out.println("网站类型：" + this.type);
    }
}
