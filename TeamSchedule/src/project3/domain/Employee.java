package com.java.project3.domain;

import com.java.project3.service.Status;
import jdk.jshell.Snippet;

/**
 * @author zhang
 * @className: Employee
 * @description:
 * @date: 2020-12-17 14:17
 * @since JDK 13
 */
public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

class Programmer extends Employee implements Equipment{
    int memberId;
    Status status = Status.FREE;
    Equipment equipment;

    public Programmer(int id,String name, int age, double salary, Equipment equipment){
        super(id, name, age, salary);
        this.equipment = equipment;
    }
}

class Designer extends Programmer {
    double bonus;

    public Designer(int id,String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }
}

class Architect extends Designer {
    int stock;

    public Architect(int id,String name, int age, double salary, Equipment equipment,double bonus, int stock) {
        super(id, name, age, salary, equipment,bonus);
        this.stock = stock;
    }
}