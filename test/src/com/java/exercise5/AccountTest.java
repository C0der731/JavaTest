package com.java.exercise5;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhang
 * @className: AccountTest
 * @description: 银行有一个账户。有两个储户分别向同一个账户存3000元，每次存1000，存三次，每次存完打印账户余额。
 * 分析：
 * @date: 2021-01-08 20:51
 * @since JDK 13
 */
class Account implements Runnable{

    private int accountBalance = 0;
    private ReentrantLock lock = new ReentrantLock(); //解决线程安全问题

    @Override
    public void run() {
        try {
            lock.lock();
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            for(int i = 0;i < 3;i++){

                accountBalance += 1000;
                System.out.println(Thread.currentThread().getName() + "存入1000元" + "，账户余额为：" + accountBalance);
            }
        }finally {
            lock.unlock();
        }
    }
}

public class AccountTest {

    public static void main(String[] args) {

        Account account = new Account();
        Thread t1 = new Thread(account);
        Thread t2 = new Thread(account);

        t1.setName("用户1");
        t2.setName("用户2");

        t1.start();
        t2.start();
    }
}