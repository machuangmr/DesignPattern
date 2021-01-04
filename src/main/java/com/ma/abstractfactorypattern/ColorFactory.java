package com.ma.abstractfactorypattern;

import com.ma.utils.StringUtils;

/**
 * 颜色工厂实现类
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String colorType) {
        if (StringUtils.isBlank(colorType)) {
            return null;
        }
        if ("red".equalsIgnoreCase(colorType)) {
            return new Red();
        }
        if ("black".equalsIgnoreCase(colorType)) {
            return new Black();
        }
        return null;
    }

    public Shape getShape(String shapeType) {
        return null;
    }
}
