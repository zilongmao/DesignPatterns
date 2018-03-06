package com.longmao.create.singlepattern.lazyloading;

/**
 * Created by longmao on 2018/3/6
 * 懒汉式，线程不安全
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
