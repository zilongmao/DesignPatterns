package com.longmao.create.singlepattern.hungryloading;

/**
 * Created by longmao on 2018/3/6
 * 饿汉式单例模式
 * 就是不管什么时候需要，都先创建一个对象。缺点是占用内存
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }
}
