package com.java.team.domain;

/**
 * @author zhang
 * @className: NoteBook
 * @description:
 * @date: 2020-12-19 16:05
 * @since JDK 13
 */
public class NoteBook implements Equipment {

    private String model;  //机器型号
    private double price;  //显示器名称

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public NoteBook() {
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return model + "(" + price + ")";
    }
}