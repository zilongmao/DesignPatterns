package com.longmao.create.builderpattern;

/**
 * Created by longmao on 2018/3/5.
 * 创建一个表示食物条目和食物包装的接口。
 */
public interface Item {

    public String name();

    public Packing packing();

    public Double price();

}
