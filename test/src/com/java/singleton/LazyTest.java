package com.java.singleton;

/**
 * @author zhang
 * @className: lazyTest
 * @description: 单例设计模式之懒汉式
 * @date: 2020-11-30 15:24
 * @since JDK 13
 */
public class LazyTest {
    public static void main(String[] args) {

    }
}

class lazy{

    //1.私有化类的构造器
    private lazy(){
    }

    //2.声明当前类的对象，没有初始化
    private static lazy instance = null;

    //3.声明public、static的返回当前类对象的方法
    public static lazy getInstance(){
        if(instance == null) {
            instance = new lazy();
        }
        return instance;
    }
}