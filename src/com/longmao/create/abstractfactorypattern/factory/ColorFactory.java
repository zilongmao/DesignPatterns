package com.longmao.create.abstractfactorypattern.factory;

import com.longmao.create.abstractfactorypattern.*;
import com.longmao.create.abstractfactorypattern.entity.*;

/**
 * Created by longmao on 2018-03-04.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color == null || "".equalsIgnoreCase(color)) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        }

        return null;
    }
}
