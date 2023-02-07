package com.java.test;

/**
 * @author zhang
 * @className: hashCodeTest
 * @description:
 * @date: 2020-12-25 14:14
 * @since JDK 13
 */
public class hashCodeTest {
    //public static final
    public static final int NUM = 1;
    public static void main(String[] args) {

        String str1 = "通话";
        String str2 = "山随";
        String str3 = "通话中";
        System.out.println(String.format("str1:%d | str2:%d | str3:%d", str1.hashCode(), str2.hashCode(), str3.hashCode()));
        System.out.println(Math.round(1.5));
        System.out.println(Math.round(-1.5));
        System.out.println();

    }
}