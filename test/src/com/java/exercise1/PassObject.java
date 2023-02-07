package com.java.exercise1;

public class PassObject {

        public void printAreas(Circle c, int time){
            System.out.println("Radius\t\tArea");
            for(int i = 1; i <= time; i++){
                c.radius = i;
                System.out.println(i + "\t\t" + c.findArea());
            }
        }
}
