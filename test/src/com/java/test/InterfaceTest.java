package com.java.test;

/**
 * @author zhang
 * @className: InterfaceTest
 * @description:
 * @date: 2020-12-08 14:40
 * @since JDK 13
 */
public class InterfaceTest {

    public static void main(String[] args) {
        System.out.println(Usb.MAX_NUM);
        //Usb.MIN_NUM = 20;
        Test test = new Test();
        test.recharge();
        test.trans();
    }
}

interface Usb{

    public static final int MAX_NUM = 10;
    int MIN_NUM = 0;  // 默认为全局常量

    public abstract void recharge();

    void trans();
}

class Test implements Usb{

    public void recharge(){
        System.out.println("充电中");
    }

    public void trans(){
        System.out.println("传输数据中");
    }
}