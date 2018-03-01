package com.longmao.create.factorypattern;

/**
 * Created by longmao on 2018-03-01.
 * 创建实现Shape接口的实现类Square(大司马形 XD)
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
