package com.longmao.create.builderpattern.entity;

import com.longmao.create.builderpattern.Meal;

/**
 * Created by longmao on 2018/3/6
 * 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象。
 */
public class MealBuilder {
    /**
     * 创建一个素食菜单
     * @return 菜单
     */
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    /**
     * 创建一个非素食菜单
     * @return
     */
    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
