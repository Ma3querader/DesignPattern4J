package com.command;


/**
 * @Author: panyusheng
 * @Date: 2021/3/13
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        // 创建遥控器
        RemoteController controller = new RemoteController();
        LightReceiver receiver = new LightReceiver();   // 创建电灯接收者(真实的执行者)
        Command lightOnCommand = new LightOnCommand(receiver);  // 创建电灯开命令实现者(用于调用者和真实执行者解耦)
        Command lightOffCommand = new LightOffCommand(receiver);  // 创建电灯关命令实现者(用于调用者和真实执行者解耦)
        // 遥控器设置命令
        controller.setCommand(0, lightOnCommand, lightOffCommand);
        controller.onButtonWasPushed(0);    // 开灯
        controller.offButtonWasPushed(0);    // 关灯
        controller.undoButtonWasPushed();   // 开灯

    }
}
