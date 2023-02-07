package com.java.thread_test;

/**
 * @author zhang
 * @className: BankTest
 * @description: 使用同步机制将单例设计模式中的懒汉式改写为线程安全的
 * @date: 2021-01-08 15:28
 * @since JDK 13
 */
public class BankTest {

}


//单例设计模式
class Bank{

    //1.私有化类的构造器
    private Bank(){
    }

    //2.声明当前类的对象，没有初始化
    private static Bank instance = null;

    //3.声明public static 返回当前类对象的方法
    public static Bank getInstance() {
        // 方式一：效率稍差，第一个线程进来后，后续的线程白跑一趟
//        synchronized (Bank.class){
//            if (instance == null){
//                instance = new Bank();
//            }
//            return instance;
//        }

        //方式二：效率更高
        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}