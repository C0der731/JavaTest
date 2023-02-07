package com.java.exercise1;

import java.util.Arrays;
import java.util.Scanner;

public class GetHighScore {
    public static void main(String[] args) {
        /*输入数据*/
        System.out.println("请输入学生人数：");
        Scanner input = new Scanner(System.in);
        int numberOfStu = input.nextInt(); //输入整型
        System.out.println(numberOfStu);

        int[] score = new int[numberOfStu]; //存储分数
        System.out.println("请输入每个学生的分数：");
        for(int i = 0; i < numberOfStu; i++){
            int scoreOfStu = input.nextInt();
            score[i] = scoreOfStu;
        }
        System.out.println("输入的分数：" + Arrays.toString(score));

        /*比较分数*/
        int maxScore = score[0];
        for(int i = 1; i < score.length; i++){
            if(score[i] > maxScore)
                maxScore = score[i];
        }
        System.out.println("最高分为：" + maxScore);

        /*分等级*/
        for(int i = 0; i< score.length; i++){
            if(score[i] >= (maxScore - 10))
                System.out.println("student " + i + " score is " + score[i] + " grade is A");
            else if(score[i] >= (maxScore - 20))
                System.out.println("student " + i + " score is " + score[i] + " grade is B");
            else if(score[i] >= (maxScore - 30))
                System.out.println("student " + i + " score is " + score[i] + " grade is C");
            else
                System.out.println("student " + i + " score is" + score[i] + "grade is D");
        }
    }
}
