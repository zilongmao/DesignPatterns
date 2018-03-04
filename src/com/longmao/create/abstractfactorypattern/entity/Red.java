package com.longmao.create.abstractfactorypattern.entity;

import com.longmao.create.abstractfactorypattern.Color;

/**
 * Created by longmao on 2018-03-04.
 * 创建实现颜色接口的实现类  红色
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("颜色是红色~");
    }
}
