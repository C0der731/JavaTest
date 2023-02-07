package com.java.exercise4;

/**
 * @author zhang
 * @className: CompareCircle
 * @description:
 * @date: 2020-12-08 19:02
 * @since JDK 13
 */
public class CompareCircle extends Circle implements CompareObject{


    public int compareTo(Object o) {

        if (this == o) {
            return 0;

        } else if (o instanceof CompareCircle) {
            CompareCircle compareCircle = (CompareCircle) o; //强转
            if (this.getRadius() == compareCircle.getRadius()) {
                return 1;
            }
        }
        return -1;
    }
}