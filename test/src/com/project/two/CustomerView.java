package com.project.two;

import java.util.Scanner;

public class CustomerView {

    private CustomerList customerList = new CustomerList(10);

    public void enterMainMenu(){

        boolean flag = true;
        while (flag) {
            System.out.println("------------客户信息管理软件------------");
            System.out.println("\t\t\t1 添加客户");
            System.out.println("\t\t\t2 修改客户");
            System.out.println("\t\t\t3 删除客户");
            System.out.println("\t\t\t4 客户列表");
            System.out.println("\t\t\t5 退    出");
            System.out.println("请输入（1-5）：");

            char menu = CMUtility.readMenuSelection();  //???

            switch (menu){
                case '1':
                    //System.out.println("测试");
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    flag = false;
                    break;
            }

        }

        System.out.println("程序结束！");

    }

    //添加新用户
    private void addNewCustomer(){

        Scanner scanner = new Scanner(System.in);

        //输入姓名
        System.out.println("姓名：");
        String name = scanner.next();

        //输入性别
        System.out.println("性别：");
        char gender = (char)scanner.nextInt();

        //输入年龄
        System.out.println("年龄：");
        int age = scanner.nextInt();

        //输入手机
        System.out.println("手机：");
        String phone = scanner.next();

        //输入邮箱
        System.out.println("邮箱：");
        String email = scanner.next();

        Customer customer = new Customer(name, gender, age, phone, email);
        customerList.addCustomer(customer);
    }

    //修改用户
    private void modifyCustomer(){
        System.out.println("请输入需要修改的用户：");
        Scanner scanner = new Scanner(System.in);

        int mod_num = scanner.nextInt();

        System.out.println("请输入需要修改的内容：");

        System.out.println("姓名：");
        String name = scanner.next();

        //输入性别
        System.out.println("性别：");
        char gender = (char)scanner.nextInt();

        //输入年龄
        System.out.println("年龄：");
        int age = scanner.nextInt();

        //输入手机
        System.out.println("手机：");
        String phone = scanner.next();

        //输入邮箱
        System.out.println("邮箱：");
        String email = scanner.next();

        Customer customer = new Customer(name, gender, age, phone, email);
        customerList.replaceCustomer(mod_num, customer);

    }
    private void deleteCustomer(){
        System.out.println("请输入需要删除的用户：");
        Scanner scanner_del = new Scanner(System.in);

        int del_num = scanner_del.nextInt();
        customerList.deleteCustomer(del_num);
        System.out.println("删除成功");
    }

    //获取当前用户信息列表
    private void listAllCustomers(){

        Customer[] customer;
        customer = customerList.getAllCustomers();
        for(int i = 0; i < customerList.getTotal(); i++) {
            System.out.println("姓名\t" + "年龄\t" + "邮箱");
            System.out.println(customer[i].getName() + "\t" + customer[i].getAge() + "\t" + customer[i].getEmail());
        }
    }

    // 主函数
    public static void main(String[] args) {

        CustomerView customerView = new CustomerView();

        customerView.enterMainMenu();
    }
}

