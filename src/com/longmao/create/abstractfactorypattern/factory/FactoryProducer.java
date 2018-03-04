package com.longmao.create.abstractfactorypattern.factory;

/**
 * Created by longmao on 2018-03-04.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice == null || "".equalsIgnoreCase(choice)) {
            return null;
        }
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
