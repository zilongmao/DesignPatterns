package com.longmao.create.builderpattern.entity;

/**
 * Created by longmao on 2018/3/6
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public Double price() {
        return 10.5;
    }
}
