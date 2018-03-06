package com.longmao.create.singlepattern.test;

/**
 * Created by longmao on 2018/3/6
 */
public class SingletonTest {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        singleton.setAge(10);
        singleton.setName("凌佛生");
        singleton.setSex(1);

        System.out.println(singleton.toString());

        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton1.toString());
    }
}
