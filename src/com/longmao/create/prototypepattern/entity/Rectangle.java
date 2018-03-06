package com.longmao.create.prototypepattern.entity;

import com.longmao.create.prototypepattern.Shape;

/**
 * Created by longmao on 2018/3/6
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("I am a Rectangle");
    }
}
