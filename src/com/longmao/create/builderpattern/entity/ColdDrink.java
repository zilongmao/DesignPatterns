package com.longmao.create.builderpattern.entity;

import com.longmao.create.builderpattern.Item;
import com.longmao.create.builderpattern.Packing;
import com.longmao.create.builderpattern.entity.Bottle;

/**
 * Created by longmao on 2018/3/6
 * 抽象冷饮类 实现item接口。有打包的函数和价格属性
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract Double price();
}
