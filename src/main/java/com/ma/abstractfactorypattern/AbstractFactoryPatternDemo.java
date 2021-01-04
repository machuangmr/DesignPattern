package com.ma.abstractfactorypattern;

/**
 * 抽象工厂测试类
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class AbstractFactoryPatternDemo {
    /**
     * 抽象工厂模式，我们可以简单理解。在一个家里，有多个衣柜，每个衣柜里面可以装不同的衣服，
     * 每个不同的衣柜我们可以理解为不同的工厂，而生产这些不同衣柜的工厂，我们就可以称为抽象工厂。
     *
     * 如何使用：系统产品中有多于一个的产品类型，而系统中只需要消费其中的一种就可以
     * 关键代码：在一个工厂里面聚合多个同类型的产品；利用不同的类型可以生产不同的工厂
     */
    public static void main(String[] args) {
        // 需求。获取一个黑色的圆形。
        //1、获取颜色的工厂
        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory colorFactory = factoryProducer.getFactory("color");
        Color black = colorFactory.getColor("black");
        black.color();

        // 2、获取一个形状工厂
        AbstractFactory shapeFactory = factoryProducer.getFactory("shape");
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
    }
}
