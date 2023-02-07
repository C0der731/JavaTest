package com.java.abstract_test;

/**
 * @author zhang
 * @className: Employee
 * @description: test the abstract
 * @date: 2020-12-01 15:25
 * @since JDK 13
 */
public abstract class Employee {

    private String name;
    private int id;
    private double salary;

    public Employee(){
        super();
    }

    public abstract void work();
}