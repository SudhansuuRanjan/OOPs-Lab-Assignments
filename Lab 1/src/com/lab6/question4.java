package com.lab6;

public class question4 {
    abstract static class Parent{
        abstract void message();
    }
    static class Subclass1 extends Parent{
        void message() {
            System.out.println("This is first Subclass.");
        }
    }
    static class Subclass2 extends Parent{
        void message() {
            System.out.println("This is second Subclass.");
        }
    }

    public static void main(String[] args) {
        Parent p1 = new Subclass1();
        p1.message();
        Parent p2 = new Subclass2();
        p2.message();
    }
}

