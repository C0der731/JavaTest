package com.java.test_20220121;

/**
 * @author zhang
 * @className: Test
 * @description:
 * @date: 2022-01-21 10:10
 * @since JDK 13
 */
public class Test {
    public static void main(String[] args) {
        Person person0 = new Person();
        System.out.println(person0.age);
        Person person1 = new Person();
        person1.age = 18;
        System.out.println(person1.age);
        Person person2 = new Person();
        person2.age = 22;
        System.out.println(person2.age);
        Person.number = 21;
        System.out.println(Person.number);
    }
}