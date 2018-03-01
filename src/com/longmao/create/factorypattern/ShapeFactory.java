package com.longmao.create.factorypattern;

/**
 * Created by longmao on 2018-03-01.
 * 创建工厂实例，用于生产图形对象
 */
public class ShapeFactory {
//  使用getShape函数来获取图形对象
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
