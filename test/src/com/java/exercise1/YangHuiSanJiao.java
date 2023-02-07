package com.java.exercise1;

import java.util.Arrays;

public class YangHuiSanJiao {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        arr[0][0] = 1;
        arr[1][0] = 1;
        arr[1][1] = 1;
        for(int i=2; i < arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(j==0)
                    arr[i][j] = 1;
                else
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }
//        for(int i=0; i < arr.length; i++){
//            System.out.println(Arrays.toString(arr[i]));
//        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }

    }

}
