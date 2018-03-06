package com.longmao.create.singlepattern.doublesynchronized;

/**
 * Created by longmao on 2018/3/6
 * 双重校验锁
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * 但很遗憾，我看不懂。。。
 */
public class Singleton {
    private volatile static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
        