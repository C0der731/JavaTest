package com.java.singleton;

/**
 * @author zhang
 * @className: Hungry
 * @description: 单例设计模式之饿汉式
 * 采取一定的方法保证在整个软件系统中，对某个类只能存在一个对象实例
 * @date: 2020-11-30 14:45
 * @since JDK 13
 */
public class HungryTest {

    public static void main(String[] args) {

        //Hungry hungry1 = new Hungry();  不允许

        //要想调用类的方法，必须先创建对象，矛盾
        //所以必须使用静态的方法，静态的方法只能调用静态的变量
        //所以在类的内部创建对象时，也必须是静态的

        Hungry.getHungry();
    }
}

class Hungry{

    //1.私有化类的构造器
    private Hungry(){
    }

    //2.内部创建类的对象
    private static Hungry hungry = new Hungry();

    //3.提供公共的方法，返回类的对象
    public static Hungry getHungry(){
        return hungry;
    }
}