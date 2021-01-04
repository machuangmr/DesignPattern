package com.ma.abstractfactorypattern;

import com.ma.utils.StringUtils;
import jdk.nashorn.internal.objects.annotations.Getter;

/**
 * 形状工厂实现类
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String colorType) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (StringUtils.isBlank(shapeType)) {
            return null;
        }

        if ("circle".equalsIgnoreCase(shapeType)){
            return new Circle();
        }
        if ("square".equalsIgnoreCase(shapeType)){
            return new Square();
        }
        return null;
    }
}
