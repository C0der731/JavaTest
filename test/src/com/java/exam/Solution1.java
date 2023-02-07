package com.java.exam;

/**
 * @author zhang
 * @className: Solution1
 * @description:
 * @date: 2021-03-27 15:14
 * @since JDK 13
 */
public class Solution1 {
    public static void main(String[] args) {
        //[-27,-118,-96,-26,-78,-71]e
//        String str1 = "加油";
////        //String code1 = URLEncoder.encode(str1,"utf-8");
////        String code1 = URLEncoder.encode(str1, "utf-8");
////        System.out.println(code1);
        //String name = "加油";
        //byte[] utf8 = name.getBytes();
        //String n = new String(utf8, "UTF-8");
        //System.out.println(utf8[0]);
        int[] data = {-27,-118,-96,-26,-78,-71};
        int a = data.length;
        System.out.println("输入数组的长度是：" + a);

        //int型数组转化为byte型数组
        byte[] b = new byte[a];

        for(int i = 0; i < a; i++){
            //b[a - i - 1] = (byte)((data[a-i] >> 8 * i) & 0xff);
            b[i] = (byte)data[i];
        }

        String s = new String(b);
        System.out.println(s);
        //b[0] = (byte)((a >> 24) & 0xFF);
        //System.out.println(b[0]);
        //byte[] b = {-27,-118,-96,-26,-78,-71};
        //String s = new String(b);
        //System.out.println(s);

    }
}