package com.java.test;

public class MyClass {
    public static void main(String[] args) {
        System.out.println("1");
        int a = 128;
        System.out.println((byte)a);  //输出 -128
        // 底层为补码存储, 128 转化为byte型后 变为 10000000, 第一位变成了符号位
    }
}
