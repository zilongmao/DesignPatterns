package com.longmao.create.abstractfactorypattern;


import com.longmao.create.abstractfactorypattern.factory.AbstractFactory;
import com.longmao.create.abstractfactorypattern.factory.FactoryProducer;

/**
 * Created by longmao on 2018-03-04.
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
//        获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

//        获取形状为CIRCLE的对象
        Shape shape1 = shapeFactory.getShape("CIRCLE");

//        调用shape1的draw()函数
        shape1.draw();
//        获取形状为SQUARE的对象
        Shape shape2 = shapeFactory.getShape("SQUARE");

//        调用shape2的draw()函数
        shape2.draw();
//        获取形状为RECTANGLE的对象
        Shape shape3 = shapeFactory.getShape("RECTANGLE");

//        调用shape3的draw()函数
        shape3.draw();



//        获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

//        获取颜色为RED的对象
        Color color1 = colorFactory.getColor("RED");

//        调用color1的fill函数
        color1.fill();

//        获取颜色为BLUE的对象
        Color color2 = colorFactory.getColor("BLUE");

//        调用color2的fill函数
        color2.fill();

//        获取颜色为GREEN的对象
        Color color3 = colorFactory.getColor("GREEN");

//        调用color3的fill函数
        color3.fill();
    }
}
