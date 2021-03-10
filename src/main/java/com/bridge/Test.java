package com.bridge;

import com.bridge.color.Black;
import com.bridge.color.White;
import com.bridge.shape.Circle;
import com.bridge.shape.Rectangle;

/**
 * @Author: panyusheng
 * @Date: 2021/3/10
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Circle c = new Circle(new White());
        c.draw();

        Rectangle r = new Rectangle(new Black());
        r.draw();
    }
}
