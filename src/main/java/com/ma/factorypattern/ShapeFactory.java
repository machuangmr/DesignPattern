package com.ma.factorypattern;

import com.ma.utils.StringUtils;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class ShapeFactory {
    //4、创建形状工厂，给予给定的一个类型，创建一个对应的对象
    public Shape getShape(String shapeType) {
        if (StringUtils.isBlank(shapeType)) {
            return null;
        }
        if ("CIRCLE".equalsIgnoreCase(shapeType)) {
            return new Circle();
        }
        if ("SQUARE".equalsIgnoreCase(shapeType)) {
            return new Square();
        }
        return null;
    }

}
