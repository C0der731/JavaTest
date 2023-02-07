package com.java.exercise3;

/**
 * @author zhang
 * @className: GeometricObject
 * @description: 多态性测试类--几何形状
 * @date: 2020-11-26 13:47
 * @since JDK 13
 */
public class GeometricObject {

    protected String color;
    protected double weight;

    public GeometricObject(String color, double weight){
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea(){
        return 1;
    }
}