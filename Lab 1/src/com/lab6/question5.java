package com.lab6;

public class question5 {

    interface Drawable{
        void display();
    }

    static class Circle implements Drawable{
        public void display() {
            System.out.println("This is a Circle.");
        }
    }
    static class Rectangle implements Drawable{
        public void display() {
            System.out.println("This is a Rectangle.");
        }
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.display();
        Rectangle r1 = new Rectangle();
        r1.display();
    }
}
