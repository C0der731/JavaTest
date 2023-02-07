package com.java.team.service;

/**
 * @author zhang
 * @className: Status
 * @description:
 * @date: 2020-12-17 15:32
 * @since JDK 13
 */
public class Status {

    private final String NAME;
    private Status(String name) {
        this.NAME = name;
    }
    public static final Status FREE = new Status("FREE");
    public static final Status VOCATION = new Status("VOCATION");
    public static final Status BUSY = new Status("BUSY");
    public String getNAME() {
        return NAME;
    }
    @Override
    public String toString() {
        return NAME;
    }

}