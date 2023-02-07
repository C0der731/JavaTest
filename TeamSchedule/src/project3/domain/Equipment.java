package com.java.project3.domain;

/**
 * @author zhang
 * @className: Equipment
 * @description:
 * @date: 2020-12-17 14:43
 * @since JDK 13
 */
public interface Equipment {

    //String getDescription();
}

interface PC extends Equipment {

    String model = null;
    String display = null;

    //PC1(String model, String display);
}

interface NoteBook extends Equipment {

}

interface Printer extends Equipment {

}