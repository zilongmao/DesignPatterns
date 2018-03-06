package com.longmao.create.builderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by longmao on 2018/3/6
 * 创建一个 Meal 类，带有上面定义的 Item 对象。
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public Double getCost() {
        Double cost = 0.0;
        for (Item item : items
                ) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items
             ) {
            System.out.print("Item: " + item.name());
            System.out.print(", Packing: " + item.packing().pack());
            System.out.println(", Price: " + item.price());
        }
    }
}
