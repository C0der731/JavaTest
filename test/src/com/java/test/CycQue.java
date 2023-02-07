package com.java.test;

public class CycQue {
    private int[] array;
    private int front;
    private int rear;

    public CycQue(int capacity){
        this.array = new int[capacity];
    }

    public void enQueue(int element) throws Exception {
        if((rear + 1)%array.length == front){
            System.out.println("队列已满！");
        }
        array[rear] = element;
        rear = (rear+1) % array.length;
    }

    public void output(){
        for(int i=front; i!=rear; i=(i+1)%array.length){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        CycQue cysQue = new CycQue(6);
        cysQue.enQueue(1);
        cysQue.enQueue(4);
        cysQue.enQueue(4);
        cysQue.enQueue(4);
        cysQue.enQueue(4);
        cysQue.output();
    }
}
