package com.project.three;

/**
 * @author zhang
 * @className: MyDate
 * @description:
 * @date: 2020-12-01 19:57
 * @since JDK 13
 */
public class MyDate {

    private int year, month, day;

    //构造器
    public MyDate(int year, int month, int day) {
        super();  //不写默认是super
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toDateString(){
        return year + "年" + month + "月" + day + "天";
    }
}