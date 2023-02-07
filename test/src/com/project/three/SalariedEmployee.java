package com.project.three;

/**
 * @author zhang
 * @className: SalariedEmployee
 * @description:
 * @date: 2020-12-01 20:05
 * @since JDK 13
 */
public class SalariedEmployee extends Employee{

    private double monthlySalary;  //月工资

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings(){
        return monthlySalary;
    }

    @Override
    public String toString(){
        return "SalariedEmployee: [" + super.toString() + "]";
    }
}