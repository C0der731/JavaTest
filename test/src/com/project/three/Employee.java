package com.project.three;

/**
 * @author zhang
 * @className: Employee
 * @description:
 * @date: 2020-12-01 19:45
 * @since JDK 13
 */
public abstract class Employee {

    private String name;
    private int number;
    private MyDate birthday;

    public Employee(String name, int number, MyDate birthday) {
        super();
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public abstract double earnings();

    public String toString(){
        return "name=" + name + " number=" + number + " birthday=" + birthday.toDateString();
    }
}