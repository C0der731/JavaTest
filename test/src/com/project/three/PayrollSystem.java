package com.project.three;

/**
 * @author zhang
 * @className: PayrollSystem
 * @description:
 * @date: 2020-12-01 21:37
 * @since JDK 13
 */
public class PayrollSystem {

    public static void main(String[] args) {

        Employee[] employees = new Employee[3];

        employees[0] = new SalariedEmployee("jack", 1001, new MyDate(1997, 10, 18), 5000);
        employees[1] = new SalariedEmployee("bob", 1002, new MyDate(1997, 5, 24), 4000);
        employees[2] = new HourlyEmployee("bob", 1002, new MyDate(1997, 5, 24), 40, 40);

        for(int i = 0; i < employees.length; i++){
            //System.out.println(employees[i].toString());
            System.out.println(employees[i]);
        }
    }
}