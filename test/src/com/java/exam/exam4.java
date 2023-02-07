package com.java.exam;

import java.util.Scanner;

/**
 * @author zhang
 * @className: exam4
 * @description:
 * @date: 2021-03-17 19:40
 * @since JDK 13
 */

//n颗糖 1,2,3,4,5... 输出可以摆的行数
public class exam4 {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();

        //System.out.println(n);
        exam4 t1 = new exam4();
        System.out.println(t1.fun(n));
    }

    //判断能否摆成功，成功返回可摆的列数
    public int fun(int n){

        int m = 0;
        int flag = 1;
        for(int i = 0; i < 1000; i++){

            n = n - (i+1);
            //System.out.println("第 " + (i+1)+ "次 "+ "n: " + n);

            if(n == 0) {
                flag = 0;
                m = i + 1;
                return m;
            }
        }

        if(flag == 1){

            System.out.println("不可摆出来！");
            return 0;
        }

        //int m = n;
        return 1;
    }
}