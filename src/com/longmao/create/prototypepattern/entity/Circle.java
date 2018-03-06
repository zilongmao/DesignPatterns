package com.longmao.create.prototypepattern.entity;

import com.longmao.create.prototypepattern.Shape;

/**
 * Created by longmao on 2018/3/6
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("I am a Circle");
    }
}
