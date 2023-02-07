package com.java.lock_test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhang
 * @className: LockTest
 * @description: 解决线程安全问题的方法3：Lock锁
 * @date: 2021-01-08 20:28
 * @since JDK 13
 */
class Window implements Runnable{

    private int ticket = 100;
    private ReentrantLock lock = new ReentrantLock();

    public void run() {
        while(true){
            try {

                lock.lock();
                if (ticket > 0) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + " 卖票，票数为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }finally {
                lock.unlock();
            }

        }
    }
}

public class LockTest {
    public static void main(String[] args) {
        Window w = new Window();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}