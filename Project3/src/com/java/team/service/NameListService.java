package com.java.team.service;

import com.java.team.domain.*;

/**
 * @author zhang
 * @className: NameListService
 * @description:
 * 负责将Data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]的方法。
 * employees用来保存公司所有员工对象
 * NameListService()构造器：
 * 根据项目提供的Data类构建相应大小的employees数组
 * 再根据Data类中的数据构建不同的对象，包括Employee、Programmer、Designer和Architect对象，以及相关联的Equipment子类的对象
 * 将对象存于数组中
 * Data类位于com.java.team.service包中
 *
 * @date: 2020-12-17 14:17
 * @since JDK 13
 */
public class NameListService {

    Employee[] employees;

    public NameListService() {
        //根据项目提供的Data类构建相应大小的employees数组
        employees = new Employee[Data.EMPLOYEES.length];

        //根据Data类中的数据构建不同的对象，包括Employee、Programmer、Designer和Architect对象
        for(int i=0; i < employees.length; i++){
            int type = Integer.parseInt(Data.EMPLOYEES[i][0]);

            //Employee类及其子类的公共属性
            int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
            String name = Data.EMPLOYEES[i][2];
            int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
            double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);

            //子类独有属性
            //Equipment equipment;
            //double bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
            //int stock = Integer.parseInt(Data.EMPLOYEES[i][6]);

            switch (type){
                case Data.EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case Data.PROGRAMMER:
                    employees[i] = new Programmer(id, name, age, salary, createEquipment(i));
                    break;
                case Data.DESIGNER:
                    double bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, createEquipment(i), bonus);
                    break;
                case Data.ARCHITECT:
                    double bonus1 = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    int stock = Integer.parseInt(Data.EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, createEquipment(i), bonus1, stock);
                    break;
            }
        }

    }

    private Equipment createEquipment(int index) {
        Equipment equipment;
        int type1 = Integer.parseInt(Data.EQUIPMENTS[index][0]);
        String model = Data.EQUIPMENTS[index][1];

        switch (type1){
            case Data.PC:
                String display = Data.EQUIPMENTS[index][2];
                equipment = new PC(model, display);
                break;
            case Data.PRINTER:
                String name = Data.EQUIPMENTS[index][1];
                String type = Data.EQUIPMENTS[index][2];
                equipment = new Printer(name, type);
                break;
            case Data.NOTEBOOK:
                double price = Double.parseDouble(Data.EQUIPMENTS[index][2]);
                equipment = new NoteBook(model, price);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type1);
        }
        return equipment;
    }

    public Employee[] getAllEmployees() {
        return employees;
    }

    public Employee getEmployee(int id) throws TeamException{
        for(int i = 0; i < employees.length;i++){
            if(employees[i].getId() == id){
                return employees[i];
            }
        }
        //未找到时，抛出异常
        throw new TeamException("找不到指定的员工");
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
}