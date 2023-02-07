package com.java.exercise3;

/**
 * @author zhang
 * @className: GeometricTest
 * @description:
 * @date: 2020-11-26 15:29
 * @since JDK 13
 */
public class GeometricTest {

    public static void main(String[] args) {

        GeometricTest test = new GeometricTest();

//        GeometricObject p1 = new Circle(3, "red", 6);
//        GeometricObject p2 = new

        test.equalsArea(new Circle(3, "red", 6), new Circle(3, "blue", 8));
    }

    //测试两个对象的面积是否相等
    public void equalsArea(GeometricObject p1, GeometricObject p2){
        if(p1.findArea() == p2.findArea()){
            System.out.println("面积相等！");
        }
    }

    //显示对象的面积
    public void displayGeometricObject(GeometricObject p1){
        System.out.println(p1.findArea());
    }
}