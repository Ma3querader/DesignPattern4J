package com.observer.normal;

/**
 * @Author: panyusheng
 * @Date: 2021/3/21
 * @Version 1.0
 */
public class WeatherData {
    private float temperatrue;
    private float pressure;
    private float humidity;

    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
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
        currentConditions.update(getTemperatrue(), getPressure(), getHumidity());
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperatrue = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //调用 dataChange， 将最新的信息 推送给 接入方 currentConditions
        dataChange();
    }


}
