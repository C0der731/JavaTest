package com.project3.service;

import com.java.project3.domain.Employee;

/**
 * @author zhang
 * @className: NameListService
 * @description:
 * @date: 2020-12-17 14:17
 * @since JDK 13
 */
public class NameListService {

    //单元测试方法
    public static void main(String[] args) {
        //NameListService nameListService
    }

    Employee[] employees;

    public NameListService(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
}