package com.java.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayTest {
    public static void main(String[] args) {
        System.out.println("this is a test.");

        //数组的静态初始化
        int[] ids1;
        ids1 = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(ids1));  //输出数组

        //数组的动态初始化
        String[] ids2 = new String[6];

        System.out.println(ids1[1]);

        ids2[0] = "张三";
        ids2[1] = "李四";
        ids2[3] = "王二";

        System.out.println(Arrays.toString(ids2));

        System.out.println(ids1.length + ids2.length);

        for (int value : ids1) {
            System.out.println(value);
        }

    }
}
