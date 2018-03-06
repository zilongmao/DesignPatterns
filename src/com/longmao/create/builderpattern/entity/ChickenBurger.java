package com.longmao.create.builderpattern.entity;

/**
 * Created by longmao on 2018/3/6
 * 肌肉汉堡，继承汉堡类
 *
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
