package com.longmao.create.builderpattern.entity;

import com.longmao.create.builderpattern.Packing;

/**
 * Created by longmao on 2018/3/5
 * 用瓶子打包
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
