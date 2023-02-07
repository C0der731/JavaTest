package com.java.thread_test;

/**
 * @author zhang
 * @className: Window1
 * @description: 解决创建多线程的方法二（Runnable接口类）的线程安全问题
 * 方法一：同步代码块
 * @date: 2021-01-07 16:13
 * @since JDK 13
 */

class Window1 implements Runnable{

    private int ticket = 100;  //三个线程共用同一个对象
                                // 继承Thread要写为 private static int ticket = 100;

    @Override
    public void run() {
        while(true){
            synchronized (Window1.class){    // Window1.class

                if(ticket > 0) {

                    try {
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + " 卖票，票号为：" + ticket);
                    ticket--;
                }else {
                    break;
                }
            }
        }
    }
}

public class WindowTest1 {

    public static void main(String[] args) {

        Window1 w1 = new Window1();

        Thread thread1 = new Thread(w1);
        Thread thread2 = new Thread(w1);
        Thread thread3 = new Thread(w1);

        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}