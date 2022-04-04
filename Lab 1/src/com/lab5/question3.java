package com.lab5;

public class question3 {
    static class Shapes{
        void area(){
            System.out.print("Area of ");
        }
    }

    static class Triangle extends Shapes{
        void area(){
            super.area();
            System.out.println("Triangle is : 1/2 x base x height ");
        }
    }

    static class Rectangle extends Shapes{
        void area(){
            super.area();
            System.out.println("Rectangle is : base x height ");
        }
    }

    static class Circle extends Shapes{
        void area(){
            super.area();
            System.out.println("Circle is : pi x radius x radius ");
        }
    }

    public static void main(String[] args) {
        Shapes shape1 = new Shapes();
        Shapes t1 = new Triangle();
        Shapes sq1 = new Rectangle();
        Shapes c1 = new Circle();

        t1.area();
        sq1.area();
        c1.area();
    }
}
