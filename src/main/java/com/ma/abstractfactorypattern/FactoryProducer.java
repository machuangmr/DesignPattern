package com.ma.abstractfactorypattern;

import com.ma.utils.StringUtils;
import sun.awt.image.OffScreenImage;

/**
 * 生产工厂的类
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class FactoryProducer {

    public AbstractFactory getFactory(String factoryType) {
        if (StringUtils.isBlank(factoryType)) {
            return null;
        }
        if ("color".equalsIgnoreCase(factoryType)) {
            return new ColorFactory();
        }
        if ("shape".equalsIgnoreCase(factoryType)) {
            return new ShapeFactory();
        }
        return null;
    }
}
