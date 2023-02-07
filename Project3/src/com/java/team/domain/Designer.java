package com.java.team.domain;

/**
 * @author zhang
 * @className: Designer
 * @description:
 * @date: 2020-12-19 16:27
 * @since JDK 13
 */
public class Designer extends Programmer{
    private double bonus;

    public Designer(int id,String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString(){

        return getDetails() + "\t设计师\t" + getStatus() + '\t' + bonus + "\t\t\t" + getEquipment().getDescription();
    }
}