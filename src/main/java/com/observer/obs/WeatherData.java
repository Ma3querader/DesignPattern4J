package com.observer.obs;

import java.util.ArrayList;

/**
 * @Author: panyusheng
 * @Date: 2021/3/21
 * @Version 1.0
 */
public class WeatherData implements Subject {

    private float temperatrue;
    private float pressure;
    private float humidity;

    //观察者集合
    private ArrayList<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (this.observers.contains(o)) {
            this.observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(v -> v.update(this.temperatrue, this.pressure, this.humidity));
    }

    public float getTemperatrue() {
        return temperatrue;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange() {
        this.notifyObservers();
    }

    //当数据有更新时，就调用 setData
    public void setData(float temperature, float pressure, float humidity) {
        this.temperatrue = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }


}
