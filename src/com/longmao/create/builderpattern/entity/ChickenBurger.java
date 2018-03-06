package com.longmao.create.builderpattern.entity;

/**
 * Created by longmao on 2018/3/6
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public Double price() {
        return 66.6;
    }
}
