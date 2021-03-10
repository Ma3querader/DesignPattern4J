package com.bridge.shape;

import com.bridge.color.Color;

/**
 * @Author: panyusheng
 * @Date: 2021/3/10
 * @Version 1.0
 */
public abstract class Shape {

    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();

}
