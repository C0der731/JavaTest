package com.java.exam;

/**
 * @author zhang
 * @className: exam2
 * @description:
 * @date: 2021-03-17 19:21
 * @since JDK 13
 */
public class exam2 {

    public int year;

    public exam2(int year){
        this.year = year;
    }

    public static void main(String[] args) {

        exam2 exa = new exam2(15);
        int num = exa.fun(exa.year);
        //Console.WriteLine();
    }

    public static int fun(int year){
        if(year < 1){
            return 0;
        }
        if(year == 1){
            return 1;
        }
        if(year == 2){
            return 2;
        }

        if(year == 3){
            return 3;
        }else {
            return (year >= 5 ? 0 : 1) + fun(year - 1) + fun(year - 3);
        }
    }
}