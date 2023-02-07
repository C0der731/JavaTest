package com.java.thread_test;

/**
 * @author zhang
 * @className: WindowTest3
 * @description:
 * @date: 2021-01-07 17:37
 * @since JDK 13
 */

class Window3 implements Runnable{

    private int ticket = 100; // 共用一个对象，静态变量

    @Override
    public void run() {
        while(true){
            show();
        }
    }

    //同步方法解决多线程的安全问题
    public synchronized void show(){
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

public class WindowTest3 {

    public static void main(String[] args) {
        Window3 w2 = new Window3();

        Thread t1 = new Thread(w2);
        Thread t2 = new Thread(w2);
        Thread t3 = new Thread(w2);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}