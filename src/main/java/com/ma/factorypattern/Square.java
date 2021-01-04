package com.ma.factorypattern;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class Square implements Shape {
    // 3、再次创建一个接口的实体类
    public void draw() {
        System.out.println("画一个正方形");
    }
}
