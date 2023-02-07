package com.java.test;

/**
 * @author zhang
 * @className: Change
 * @description:
 * @date: 2021-03-23 22:26
 * @since JDK 13
 */
public class P{

    public String userName = "A";
    public int age = 18;
    public static int count = 1;

    public static void main(String[] args){

        P p = new P();
        p.change(p , 20);
        System.out.println(p.userName +" "+ p.age + " " + p.count);

    }

    public void change(P p, int age){
        age = age;
        p.count = 2;
        userName = "C";
    }
}