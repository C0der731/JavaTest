package com.java.thread_test;

/**
 * @author zhang
 * @className: WindowTest2
 * @description: 使用同步方法来解决多线程的安全问题
 * @date: 2021-01-07 16:19
 * @since JDK 13
 */

class Window2 extends Thread{

    private static int ticket = 100; // 共用一个对象，静态变量
    @Override
    public void run() {
        while(true){
            show();
        }
    }

    //同步方法解决多线程的安全问题
    public static synchronized void show(){  // 静态方法
            if(ticket > 0){
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " 卖票，票号为：" + ticket);
                ticket--;
            }
    }
}

public class WindowTest2 {

    public static void main(String[] args) {
        Window2 w1 = new Window2();
        Window2 w2 = new Window2();
        Window2 w3 = new Window2();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}