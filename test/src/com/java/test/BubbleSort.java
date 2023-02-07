package com.java.test;

import java.util.Arrays;

public class BubbleSort {
    public static void BubbleSort(int[] a){
        //LinkedList<Integer> b = new LinkedList<Integer>();
        System.out.println(Arrays.toString(a));

        int b[] = new int[9];
        b = a;
        //System.out.println(Arrays.toString(a));
        int temp;
        for(int i=0; i < 8;i++){
            for (int j = 0; j < 8-i ;j++){
                if(b[j] > b[j+1]){
                    temp = b[j];
                    b[j] = b[j+1];
                    b[j+1] = temp;
                }
            }
            //System.out.println(Arrays.toString(a));
        }
        System.out.println(Arrays.toString(b));

    }

    public static void main(String[] args) {
        int[] a = {2,0,1,10,4,8,5,11,8};
        //System.out.println(a);
        BubbleSort(a);
        //System.out.println(Arrays.toString(a));
    }
}
