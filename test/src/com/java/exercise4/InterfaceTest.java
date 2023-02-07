package com.java.exercise4;

/**
 * @author zhang
 * @className: Test
 * @description:
 * @date: 2020-12-08 18:58
 * @since JDK 13
 */
public class InterfaceTest {

    public static void main(String[] args) {

        CompareCircle compareCircle1 = new CompareCircle();
        CompareCircle compareCircle2 = new CompareCircle();

        compareCircle1.setRadius(5);
        compareCircle2.setRadius(6);

        compareCircle1.compareTo(compareCircle2);
    }
}

interface CompareObject{

    //返回值为0代表相等，正数当前对象大
    public int compareTo(Object o);
}