package com.longmao.create.abstractfactorypattern.entity;

import com.longmao.create.abstractfactorypattern.Shape;

/**
 * Created by longmao on 2018-03-01.
 * 创建实现Shape接口的实现类Square(大司马形 XD)
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("我的形状是正方形");
    }
}
