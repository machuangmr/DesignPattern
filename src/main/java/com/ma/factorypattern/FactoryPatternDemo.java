package com.ma.factorypattern;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
       // 创建一个工厂类
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        Shape square = shapeFactory.getShape("square");
        square.draw();
    }
}
