package com.longmao.create.prototypepattern;

import com.longmao.create.prototypepattern.entity.Circle;
import com.longmao.create.prototypepattern.entity.Rectangle;
import com.longmao.create.prototypepattern.entity.Square;
import sun.security.provider.SHA;

import java.util.Hashtable;

/**
 * Created by longmao on 2018/3/6
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap
            = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cacheShape = shapeMap.get(shapeId);
        return (Shape) cacheShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(), square);


    }
}
