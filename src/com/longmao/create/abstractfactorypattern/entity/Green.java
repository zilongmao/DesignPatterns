package com.longmao.create.abstractfactorypattern.entity;

import com.longmao.create.abstractfactorypattern.Color;

/**
 * Created by longmao on 2018-03-04.
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("颜色是绿色");
    }
}
