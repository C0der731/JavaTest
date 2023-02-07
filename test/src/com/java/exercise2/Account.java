package com.java.exercise2;

public class Account {
     private int id;
     private double balance;
     private double annualInterestRate;

     //构造器
    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    //取钱
    public void withdraw(double amount){
        //判断用户余额是否满足提款数额要求
        if (this.balance > amount) {
            balance -= amount;
            System.out.println("成功取出：" + amount + "元");
        }else{
            System.out.println("您的余额不足，请及时充值！");
        }

    }

    //存钱
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("成功存入：" + amount + "元");
        }
    }
}
