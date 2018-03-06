package com.longmao.create.prototypepattern;

import sun.security.provider.SHA;

/**
 * Created by longmao on 2018/3/6
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape cloneShape1 = (Shape) ShapeCache.getShape("1");

        System.out.println("Shape: " + cloneShape1.getType());

        Shape cloneShape2 = (Shape) ShapeCache.getShape("2");

        System.out.println("Shape: " + cloneShape2.getType());

        Shape cloneShape3 = (Shape) ShapeCache.getShape("3");

        System.out.println("Shape: " + cloneShape3.getType());
    }
}
