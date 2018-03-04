package com.longmao.create.abstractfactorypattern.factory;

import com.longmao.create.abstractfactorypattern.*;
import com.longmao.create.abstractfactorypattern.entity.Circle;
import com.longmao.create.abstractfactorypattern.entity.Rectangle;
import com.longmao.create.abstractfactorypattern.entity.Square;

/**
 * Created by longmao on 2018-03-04.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        if (shape == null || "".equals(shape)){
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
