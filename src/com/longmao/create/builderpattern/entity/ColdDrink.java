package com.longmao.create.builderpattern.entity;

import com.longmao.create.builderpattern.Item;
import com.longmao.create.builderpattern.Packing;
import com.longmao.create.builderpattern.entity.Bottle;

/**
 * Created by longmao on 2018/3/6
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract Double price();
}
