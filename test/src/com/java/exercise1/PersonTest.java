package com.java.exercise1;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(2);
        int a = person.getAge();
        System.out.println(a);
    }
}


class Person{
    private int age;

    public int getAge(){
        return age;
    }

    public void setAge(int a){
        age = a;
    }
}