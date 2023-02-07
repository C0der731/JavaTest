package com.java.team.domain;

/**
 * @author zhang
 * @className: Printer
 * @description:
 * @date: 2020-12-19 16:07
 * @since JDK 13
 */
public class Printer implements Equipment {
    private String name;  //
    private String type;  //机器类型

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Printer() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String getDescription() {
        return name + "(" + type + ")";
    }
}