package com.command;

/**
 * @Author: panyusheng
 * @Date: 2021/3/14
 * @Version 1.0
 */
public class RemoteController {

    // 开关按钮的命令数组
    private Command[] onCommands;
    private Command[] offCommands;

    // 撤销的命令
    private Command undoCommand;

    // 假设遥控器有5组键，用空命令初始化
    public RemoteController() {
        this.onCommands = new Command[5];
        this.offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            this.onCommands[i] = new NoCommand();
            this.offCommands[i] = new NoCommand();
        }
    }

    // 设置按钮命令
    public void setCommand(int no, Command onCommand, Command offCommand) {
        this.onCommands[no] = onCommand;
        this.offCommands[no] = offCommand;
    }

    // 按下开按钮
    public void onButtonWasPushed(int no) {
        this.onCommands[no].execute();
        // 记录这次的操作，用于撤销
        undoCommand = this.onCommands[no];
    }

    // 按下关按钮
    public void offButtonWasPushed(int no) {
        this.offCommands[no].execute();
        undoCommand = this.offCommands[no];
    }

    // 按下撤销按钮
    public void undoButtonWasPushed() {
        this.undoCommand.undo();
    }


}
