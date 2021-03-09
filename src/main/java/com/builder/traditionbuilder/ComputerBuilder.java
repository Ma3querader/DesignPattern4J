package com.builder.traditionbuilder;

/**
 * @Author: panyusheng
 * @Date: 2021/3/9
 * @Version 1.0
 */
// 构建者抽象基类，定义构建product的抽象步骤，包含一个返回product的方法
public abstract class ComputerBuilder {
    public abstract void setUsbCount();

    public abstract void setKeyboard();

    public abstract void setDisplay();

    public abstract Computer getComputer();
}
