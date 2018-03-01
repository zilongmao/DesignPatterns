package com.longmao.create.factorypattern;

/**
 * Created by longmao on 2018-03-01.
 * 创建实现Shape接口的实现类Rectangle(矩形)
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
