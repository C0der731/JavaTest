package com.java.exercise5;

/**
 * @author zhang
 * @className: CommunicationTest1
 * @description:
 * @date: 2021-01-10 21:03
 * @since JDK 13
 */


class Communication1 extends Thread {
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

public class CommunicationTest1 {

    public static void main(String[] args) {
        Communication1 t1 = new Communication1();
        Communication1 t2 = new Communication1();

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}