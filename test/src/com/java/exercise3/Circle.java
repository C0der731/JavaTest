package com.java.exercise3;

/**
 * @author zhang
 * @className: Circle
 * @description: 多态测试类--圆
 * @date: 2020-11-26 14:11
 * @since JDK 13
 */
public class Circle extends GeometricObject {

    private double radius;

    public Circle(double radius, String color, double weight){
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI * radius * radius;
    }
}