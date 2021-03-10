package com.adapter.objadapter;

/**
 * @Author: panyusheng
 * @Date: 2021/3/10
 * @Version 1.0
 */
public class VoltageAdapter implements Voltage5V {

    private Voltage220V v;

    public VoltageAdapter(Voltage220V v) {
        this.v = v;
    }

    @Override
    public int output5V() {
        int i = v.output220V() / 44;
        return i;
    }
}
