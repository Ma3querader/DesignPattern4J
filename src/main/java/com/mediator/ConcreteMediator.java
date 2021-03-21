package com.mediator;

import java.util.HashMap;

/**
 * @Author: panyusheng
 * @Date: 2021/3/21
 * @Version 1.0
 */
public class ConcreteMediator extends Mediator {

    private HashMap<String, Colleague> colleagueMap;

    public ConcreteMediator() {
        this.colleagueMap = new HashMap<>();
    }

    @Override
    public void Register(String colleagueName, Colleague colleague) {
        this.colleagueMap.put(colleagueName, colleague);
    }

    @Override
    public void GetMessage(int stateChange, String colleagueName) {
        if (this.colleagueMap.get(colleagueName) instanceof Alarm) {
            Alarm alarm = (Alarm) this.colleagueMap.get("alarm");
            alarm.cook();
        }
    }

}
