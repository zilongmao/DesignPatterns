package com.longmao.create.singlepattern.lazyloadings;

/**
 * Created by longmao on 2018/3/6
 * 懒汉式，线程安全
 * 缺点是必须加锁才能保证线程安全，影响效率。
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            return instance;
        }
        return instance;
    }
}
