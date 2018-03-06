package com.longmao.create.builderpattern.entity;

/**
 * Created by longmao on 2018/3/6
 * 创建百事可乐继承冷饮类，价格为15.6~
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public Double price() {
        return 15.6;
    }
}
