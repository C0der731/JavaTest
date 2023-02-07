package com.wrapper_test;

import java.util.Scanner;
import java.util.Vector;

/**
 * @author zhang
 * @className: WrapperTest1
 * @description:
 * @date: 2020-11-28 15:42
 * @since JDK 13
 */
public class WrapperTest1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Vector grades = new Vector();

        boolean isFlag = true;

        while(isFlag) {
            int gra = scanner.nextInt();

            if(gra <= 0){
                break;
            }
            grades.addElement(gra);

            System.out.println(grades);


        }
        Integer temp = 0;
        for(int i = 0; i < grades.size(); i++){

            if(temp < (Integer) grades.elementAt(i)){
                temp = (Integer) grades.elementAt(i);
            }
        }

        System.out.println("最高分为：" + temp);
        for(int i = 0; i < grades.size(); i++) {


        }
    }
}