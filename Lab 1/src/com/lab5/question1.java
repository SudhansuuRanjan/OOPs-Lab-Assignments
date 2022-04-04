package com.lab5;

public class question1 {

    static class Fruit{
        void show(){
            System.out.println("This is Parent Class.");
        }
    }

    static class Mango extends Fruit{
        void showFruit(){
            System.out.println("This is child Class.");
        }
    }

    public static void main(String[] args) {
       Fruit papaya = new Fruit();
       Mango m1 = new Mango();

       papaya.show();
       m1.showFruit();
       m1.show();
    }
}
