package com.java.exam;

import java.util.Scanner;

/**
 * @author zhang
 * @className: exam1
 * @description:
 * @date: 2021-03-17 19:03
 * @since JDK 13
 */
public class exam1 {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int m = s1.nextInt(); //记录输入行数
        int n = s1.nextInt(); //记录输入列数

        int num[][] = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                num[i][j] = s1.nextInt();
            }
        }

        print(m, n, num);


    }

    //函数主体
    public static void print(int m, int n, int[][] num){

        //1.打印第0 - n-1列
        for(int k = 0; k < n; k++){
            for(int i = 0, j = k; i < m && j >= 0; i++,j--){
                System.out.println(num[i][j]);
                System.out.println(",");
            }
        }

        //2.打印第1 - m-1行
        for(int k = 1; k < m; k++){
            for(int i = k, j = n-1; i < m && j >= 0; i++,j--){
                System.out.println(num[i][j]);
                if(!(i == m-1 && j == n-1))
                    System.out.println(",");
            }
        }
    }
}