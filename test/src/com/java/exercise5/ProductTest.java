package com.java.exercise5;

/**
 * @author zhang
 * @className: ProductTest
 * @description:
 * @date: 2021-01-10 21:38
 * @since JDK 13
 */
class Clerk{
    private int numOfProduct;

    public synchronized void produceProduct(){
        if(numOfProduct < 20){
            notify();
            numOfProduct++;
            System.out.println(Thread.currentThread().getName() + "开始生产第" + numOfProduct + "个产品");
        }else {

            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public synchronized void consumeProduct(){
        if(numOfProduct > 0){

            notify();
            numOfProduct--;
            System.out.println(Thread.currentThread().getName() + "开始消费第" + numOfProduct + "个产品");
        }else {

            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class Producer extends Thread{
    private Clerk clerk;

    public Producer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {

        System.out.println(getName() + "开始生产产品......");
        while (true){
            try {
                sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            clerk.produceProduct();
        }
    }
}

class Customer extends Thread{
    private Clerk clerk;

    public Customer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + "开始消费产品......");
        while (true){
            try {
                sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            clerk.consumeProduct();
        }
    }
}

public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer p1 = new Producer(clerk);
        Customer c1 = new Customer(clerk);

        p1.setName("生产者");
        c1.setName("消费者");

        p1.start();
        c1.start();
    }
}