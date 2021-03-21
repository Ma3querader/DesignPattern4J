package com.mediator;



/**
 * @Author: panyusheng
 * @Date: 2021/3/21
 * @Version 1.0
 */
public class Alarm extends Colleague {

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name, this);
    }

    public void SendAlarm(int stateChange) {
        this.SendMessage(stateChange);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.getMediator().GetMessage(stateChange, this.name);
    }

    public void cook() {
        System.out.println("煮咖啡...");
    }
}
