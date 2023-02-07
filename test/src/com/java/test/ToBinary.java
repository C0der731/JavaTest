package com.java.test;

import java.util.Scanner;

/**
 * @author zhang
 * @className: ToBinary
 * @description:
 * @date: 2021-03-12 15:49
 * @since JDK 13
 */

public class ToBinary {

    //十进制转二进制
    public static void function1(int n) {
        String result = Integer.toBinaryString(n);
        //int r = Integer.parseInt(result);
        //System.out.println(r);
        System.out.println(result);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("请输入整数：");
        int num = input.nextInt();
        String a = "";//用字符串拼接
        int flag = 0; //记录输入数字的正负
        int num1 = num; // 用来转二进制
        int num2 = num; // 用来转十六进制

        if (num < 0) {
            flag = 1;
            num1 = -num;
            num2 = -num;
        }

        /////////十进制转八位二进制/////////
        while (num1 != 0) {//利用十进制转二进制除2法
            a = num1 % 2 + a;
            num1 = num1 / 2;
        }
        String num_binary = String.format("%08d", Integer.valueOf(a));
        /////////十进制转八位二进制/////////

        /////////十进制转八位十六进制/////////
        int i = 0;
        char[] S = new char[100];
        String num_hex = ""; //存放转化后的十六进制

        if(num2 == 0){
            System.out.print(0);
        }
        else{
            while(num2!=0)
            {
                int t = num2 % 16;
                if(t >=0 && t<10)
                {
                    S[i] = (char)(t + '0');
                    i++;
                }
                else
                {
                    S[i] = (char)(t+'A'-10);
                    i++;
                }
                num2 = num2 /16;
            }

            System.out.println("i: " + i);

            for (int j=i-1;j>=0;j--)
            {
                //System.out.print(S[j]);
                num_hex = num_hex + S[j];
            }
        }
        System.out.println("i: " + i);

        //十六进制 部分数无法转化为int型
        //String b2 = String.format("%04d", Integer.valueOf(b1));
        String num_hex1 = ""; //存放补0后的十六进制（未加符号位）

        //要求输出四位的十六进制，故只判断两种情况
        if(i == 2){
            num_hex1 = "00" + num_hex;
        }else if(i == 3){
            num_hex1 = "0" + num_hex;
        }

        //System.out.println("00" + b1);

        if (flag == 0) {
            System.out.println(num_binary + ',' + num_hex1);

        } else {
            String num_binary1 = num_binary.replaceFirst(".", "1"); //二进制添加符号位
            String num_hex2 = num_hex1.replaceFirst(".", "1"); //十六进制添加符号位

            System.out.println(num_binary1 + ',' + num_hex2);
        }

    }
}



