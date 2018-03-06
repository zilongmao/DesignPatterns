package com.longmao.create.singlepattern.simple;

/**
 * Created by longmao on 2018/3/6
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        //    new一个对象，发现并不能实例化。提示已被私有
//    SingleObject so = new SingleObject();

        //    获取唯一可见的对象
        SingleObject obj = SingleObject.getInstance();
        obj.showMessage();
    }
}
