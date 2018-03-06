package com.longmao.create.prototypepattern.entity;

import com.longmao.create.prototypepattern.Shape;

/**
 * Created by longmao on 2018/3/6
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("I am a Square");
    }
}
