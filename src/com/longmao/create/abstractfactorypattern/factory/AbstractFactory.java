package com.longmao.create.abstractfactorypattern.factory;

import com.longmao.create.abstractfactorypattern.Color;
import com.longmao.create.abstractfactorypattern.Shape;

/**
 * Created by longmao on 2018-03-04.
 * 为 Color 和 Shape 对象创建抽象类来获取工厂。
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
