package com.longmao.create.abstractfactorypattern.entity;

import com.longmao.create.abstractfactorypattern.Color;

/**
 * Created by longmao on 2018-03-04.
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("颜色是蓝色");
    }
}
