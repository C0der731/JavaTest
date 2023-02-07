package com.java.exercise1;

public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle angle = new TriAngle(2, 4);

        int base = angle.getBase();
        int height = angle.getHeight();

        System.out.println(base + " " + height);
    }
}
