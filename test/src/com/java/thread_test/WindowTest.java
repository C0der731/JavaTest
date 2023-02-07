package com.java.thread_test;

/**
 * @author zhang
 * @className: WindowTest
 * @description:
 * @date: 2021-01-05 14:31
 * @since JDK 13
 */

class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

public class WindowTest {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(myThread);
        Thread thread3 = new Thread(myThread);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
