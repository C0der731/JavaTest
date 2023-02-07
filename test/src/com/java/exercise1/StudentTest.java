package com.java.exercise1;

import java.util.Random;

public class StudentTest {
    public static void main(String[] args) {

        Random rand = new Random(); //生成随机数
        Student[] stus = new Student[20]; //声明一个Student对象数组

        for (int i = 1; i < stus.length; i++) {
            //Student stus[i] = new Student();
        stus[i] = new Student();
        stus[i].number = i;

        //stus[i].state = (int)(Math.random() * (6 - 1 + 1) + 1);
        //stus[i].score = (int)(Math.random() * (100 - 0 + 1));
        stus[i].state = rand.nextInt(4);
        stus[i].score = rand.nextInt(100);
        }

        StudentTest test = new StudentTest();
        test.print(stus);
    }

    //遍历数组
    public void print(Student[] sous){
        for (int i = 1; i < sous.length; i++) {
            if (sous[i].state == 3)
                sous[i].info();
        }
    }
}

class Student{
    int number,state,score;

    public void info(){
        System.out.println("学号:" + number + " 年级:" + state +" 成绩:" + score);
    }
}
