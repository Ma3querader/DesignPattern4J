package com.builder.traditionbuilder;

/**
 * @Author: panyusheng
 * @Date: 2021/3/9
 * @Version 1.0
 */
// 指挥者 决定如何构建最终product
public class ComputerDirector {
    public void construct(ComputerBuilder builder) {
        builder.setUsbCount();
        builder.setDisplay();
        builder.setKeyboard();
    }
}
