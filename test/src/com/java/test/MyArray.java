package com.java.test;

public class MyArray {
    private int[] array;
    private int size;

    public MyArray(int capacity){
        this.array = new int[capacity];
    }

    /**
     * @param index 插入的位置
     * @param element 插入的元素
     */

    public void insert(int index, int element) throws Exception {

        //判断访问下标是否超出范围
//        if(index < 0 || index > size){
//            throw new IndexOutOfBoundsException("超出数组实际元素范围!");
//        }

//        //如果实际元素达到数组容量上限，对数组进行扩容
//        if(size >= array.length){
//            resize();
//        }

        //从右向左将元素挪位
        for(int i = size-1; i >= index; i--){
            array[i+1] = array[i];
        }

        //放置新元素
        array[index] = element;
        size++;
    }

    /**
     * 数组扩容
     */
//    public void resize(){
//        int[] arrayNew = new int[array.length*2];
//
//        //从旧数组复制到新数组
//        System.arraycopy(array, 0, arrayNew, 0, array.length);
//        array = arrayNew;
//    }


    /**
     * 输出数组
     */

    public void output(){
        for(int i=0; i<size; i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        MyArray myArray = new MyArray(10);

        myArray.insert(1,2);
        myArray.insert(2,3);
        myArray.insert(3,4);

        //System.out.println(myArray);
        myArray.output();
    }
}


