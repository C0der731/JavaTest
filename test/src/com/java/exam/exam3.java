package com.java.exam;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author zhang
 * @className: exam3
 * @description:
 * @date: 2021-03-17 20:02
 * @since JDK 13
 */
public class exam3 {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        String s = s1.next();
        exam3 e = new exam3();

        System.out.println(e.calculator(s));
    }

    public int calculator(String s) {

        Stack<Integer> stack = new Stack<Integer>();

        int flag = 1, ans = 0; //flag表示正负标志位
        int length = s.length(); //存储输入字符串长度

        for(int i = 0; i < length; i++){

            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int cur = ch - '0';
                while (i + 1 < length && Character.isDigit(s.charAt(i + 1)))
                    cur = cur * 10 + s.charAt(++i) - '0';
                ans = ans + flag * cur;
            }else if(ch == '+'){
                flag = 1;
            }else if(ch == '-'){
                flag = -1;
            }else if(ch == '('){
                stack.push(ans);
                ans = 0;
                stack.push(flag);
                flag = 1;
            }else if(ch == ')'){
                ans = stack.pop() * ans + stack.pop();
            }
        }
        return ans;
    }
}