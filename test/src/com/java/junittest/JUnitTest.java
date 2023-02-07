package com.java.junittest;

import org.junit.Test;

import java.util.Date;

/**
 * @author zhang
 * @className: JUnitTest
 * @description: 单元测试案例
 * @date: 2020-11-26 21:11
 * @since JDK 13
 */
public class JUnitTest {

    @Test
    public void test(){

        System.out.println("This is a test!");

        Object obj = new String("GG");

        if(obj instanceof Date){
            Date date = (Date) obj;
        }else
            System.out.println("false");
    }
}