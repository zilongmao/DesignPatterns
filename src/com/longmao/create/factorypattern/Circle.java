package com.longmao.create.factorypattern;

/**
 * Created by longmao on 2018-03-01.
 * 创建实现Shape接口的实现类Circle(圆形)
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
