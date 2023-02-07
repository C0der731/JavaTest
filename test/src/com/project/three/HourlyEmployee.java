package com.project.three;

/**
 * @author zhang
 * @className: HourlyEmployee
 * @description:
 * @date: 2020-12-01 21:19
 * @since JDK 13
 */
public class HourlyEmployee extends Employee{

    private double wage;
    private double hour;

    public HourlyEmployee(String name, int number, MyDate birthday, int wage, int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public double earnings(){
        return wage * hour;
    }

    public String toString(){
        return "HourlyEmployee: [" + super.toString() + " ]";
    }
}