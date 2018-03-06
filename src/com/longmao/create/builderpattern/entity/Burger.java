package com.longmao.create.builderpattern.entity;

import com.longmao.create.builderpattern.Item;
import com.longmao.create.builderpattern.Packing;
import com.longmao.create.builderpattern.entity.Wrapper;

/**
 * Created by longmao on 2018/3/5
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    public abstract Double price();
}

