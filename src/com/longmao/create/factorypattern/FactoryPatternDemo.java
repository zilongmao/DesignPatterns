package com.longmao.create.factorypattern;

/**
 * Created by longmao on 2018-03-01.
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
//        创建工厂实例
        ShapeFactory shapeFactory = new ShapeFactory();

//        获取 Circle 的对象，并调用它的draw()函数
        Shape shape1 = shapeFactory.getShape("CIRCLE");

//        调用 Circle 的draw()函数
        shape1.draw();

//        获取 Rectangle 的对象，并调用它的draw()函数
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

//        调用 Rectangle 的 draw()函数
        shape2.draw();

//        获取 Square 的对象，并调用它的draw()函数
        Shape shape3 = shapeFactory.getShape("SQUARE");

//        调用 Square 的 draw() 函数
        shape3.draw();

    }
}
