package com.lab6;

public class question1 {
    static class Car{
       final int speed;

        Car() {
            speed = 220;
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.speed);
    }
}
