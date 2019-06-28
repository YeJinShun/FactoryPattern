package com.example.dell.factorypattern.utils;

import com.example.dell.factorypattern.api.Shape;
import com.example.dell.factorypattern.bean.Circle;
import com.example.dell.factorypattern.bean.Rectangle;
import com.example.dell.factorypattern.bean.Square;

public class ShapeFactory {
    //使用getShape方法获取形状的对象
    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return  null;
    }

}
