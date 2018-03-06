package com.longmao.create.builderpattern.entity;

/**
 * Created by longmao on 2018/3/6
 * 素汉堡的价格为33.3元
 */
public class VegBurger extends Burger {
    @Override
    public Double price() {
        return 33.3;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
