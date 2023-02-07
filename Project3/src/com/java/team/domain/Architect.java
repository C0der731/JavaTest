package com.java.team.domain;

/**
 * @author zhang
 * @className: Architect
 * @description:
 * @date: 2020-12-19 16:30
 * @since JDK 13
 */
public class Architect extends Designer{
    int stock;

    public Architect(int id,String name, int age, double salary, Equipment equipment,double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString(){

        return getDetails() + "\t架构师\t" + getStatus() + '\t' + getBonus() + '\t' + stock + '\t' + getEquipment().getDescription();
    }
}