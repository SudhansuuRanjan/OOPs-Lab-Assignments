package com.lab6;

abstract class Parent{
    abstract void message();
}
class Subclass1 extends Parent{
    void message() {
        System.out.println("This is first Subclass.");
    }
}
class Subclass2 extends Parent{
    void message() {
        System.out.println("This is second Subclass.");
    }
}

public class question4 {
    public static void main(String[] args) {
        Parent p1 = new Subclass1();
        p1.message();
        Parent p2 = new Subclass2();
        p2.message();
    }
}

