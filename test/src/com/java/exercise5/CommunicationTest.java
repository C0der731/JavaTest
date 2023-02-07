package com.java.exercise5;

/**
 * @author zhang
 * @className: CommunicationTest
 * @description: 线程间的通信，wait()实现
 * @date: 2021-01-10 20:21
 * @since JDK 13
 */

class Communication implements Runnable {
    private int num = 1;

    @Override
    public void run() {
        while(true){
            synchronized (this){

                this.notify();

                if(num <= 100){

                    try{
                        Thread.sleep(10);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + ":" + num);
                    num++;

                    try{
                        this.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                }else {
                    break;
                }
            }
        }
    }
}

public class CommunicationTest {

    public static void main(String[] args) {
        Communication communication = new Communication();
        Thread t1 = new Thread(communication);
        Thread t2 = new Thread(communication);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}