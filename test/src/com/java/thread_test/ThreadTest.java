package com.java.thread_test;

/**
 * @author zhang
 * @className: ThreadTest
 * @description:
 * @date: 2021-01-04 23:27
 * @since JDK 13
 */
public class ThreadTest {
    public static void main(String[] args) {

        MyThread1 myThread1 = new MyThread1();
        myThread1.setName("线程1");
        myThread1.start();

        //设置主线程名
        Thread.currentThread().setName("主线程");
        for(int i = 0; i < 100; i++){
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }

//            if(i == 30){
//                try {
//                    myThread1.join();
//                }catch (InterruptedException e){
//                    e.printStackTrace();
//                }
//            }
        }
    }
}

class MyThread1 extends Thread{

    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
                //System.out.println(MyThread.currentThread());
            }

            if(i % 20 == 0){
                yield();
            }
//            try {
//                sleep(1000);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }

        }
    }
}