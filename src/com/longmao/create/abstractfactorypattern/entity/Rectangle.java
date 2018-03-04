package com.longmao.create.abstractfactorypattern.entity;

import com.longmao.create.abstractfactorypattern.Shape;

/**
 * Created by longmao on 2018-03-01.
 * 创建实现Shape接口的实现类Rectangle(矩形)
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("我的形状是矩形");
    }
}
