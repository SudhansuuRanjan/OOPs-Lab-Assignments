package com.assignment5;

class Car {
    public void Info() {
        System.out.println("Cars are widely used modes of transportation.");
    }
}
class Buggati extends Car{
    public void Info() {
        System.out.println("Buggati is one   of the fastest car manufactures.");
    }
}
class Veron extends Buggati {
    public void Info() {
        System.out.println("Buggatti Veron is the fastest car in the world.");
    }
}

public class question3 {
    public static void main(String args[]) {
        Car c1 = new Car();
        Buggati b1 = new Buggati();
        Veron v1 = new Veron();
        c1.Info();
        b1.Info();
        v1.Info();
    }
}
