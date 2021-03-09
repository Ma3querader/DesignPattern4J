package com.builder.traditionbuilder;

/**
 * @Author: panyusheng
 * @Date: 2021/3/9
 * @Version 1.0
 */
// 苹果电脑具体构建者
public class MacComputerBuilder extends ComputerBuilder {
    private Computer computer;

    public MacComputerBuilder(String cpu, String ram) {
        computer = new Computer(cpu, ram);
    }

    @Override
    public void setUsbCount() {
        computer.setUsbCount(2);
    }

    @Override
    public void setKeyboard() {
        computer.setKeyboard("苹果键盘");
    }

    @Override
    public void setDisplay() {
        computer.setDisplay("苹果显示器");
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
