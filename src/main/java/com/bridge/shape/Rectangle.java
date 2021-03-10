package com.bridge.shape;

import com.bridge.color.Color;

/**
 * @Author: panyusheng
 * @Date: 2021/3/10
 * @Version 1.0
 */
public class Rectangle extends Shape {
    private Color color;

    public Rectangle(Color color) {
        super(color);
        this.color = color;
    }

    @Override
    public void draw() {
        this.color.paint("三角形");
    }
}
