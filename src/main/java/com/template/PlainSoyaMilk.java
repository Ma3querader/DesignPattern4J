package com.template;

/**
 * @Author: panyusheng
 * @Date: 2021/3/12
 * @Version 1.0
 */
public class PlainSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        // 原味豆浆，空实现
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
