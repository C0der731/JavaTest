package com.java.exercise3;

/**
 * @author zhang
 * @className: MyRectangle
 * @description: 多态测试类--矩形
 * @date: 2020-11-26 14:12
 * @since JDK 13
 */
public class MyRectangle extends GeometricObject {

    private double width;
    private double height;

    public MyRectangle(double width, double height, String color, double weight){
        super(color, weight);

        this.width = width;
        this.height = height;
    }

    public double findArea(){
        return width * height;
    }
}