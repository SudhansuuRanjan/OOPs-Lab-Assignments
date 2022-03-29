package com.assignment5;

public class question5 {

    static class Animal{
        String color;
        Animal(String color){
            this.color = color;
        }
        void printColor(){
            System.out.println("Color of animal : " + color);
        }
    }

    static class Dog extends Animal{
        Dog(String color) {
            super(color);
        }
    }

    public static void main(String[] args) {
       Animal Lion = new Animal("Yellow");
       Animal dog = new Dog("Brown");
       Lion.printColor();
       dog.printColor();
    }
}
