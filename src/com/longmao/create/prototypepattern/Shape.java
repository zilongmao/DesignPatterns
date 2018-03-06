package com.longmao.create.prototypepattern;

/**
 * Created by longmao on 2018/3/6
 * 创建一个实现了 Clonable 接口的抽象类。
 */
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    public abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
