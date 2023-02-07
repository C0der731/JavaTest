package com.wrapper_test;

import java.util.Scanner;
import java.util.Vector;

/**
 * @author zhang
 * @className: WrapperTest
 * @description: test the wrapper
 * Vector代替数组处理，从键盘输入学生成绩（负数代表输入结束），找出最高分，输出学生成绩等级
 * @date: 2020-11-28 15:22
 * @since JDK 13
 */
public class WrapperTest {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            Vector grades = new Vector();

            int gra = scanner.nextInt();

            if(gra >= 0){
                grades.addElement(gra);
            }

            System.out.println(grades);
    }
}