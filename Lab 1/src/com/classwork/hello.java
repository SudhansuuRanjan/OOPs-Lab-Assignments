package com.classwork;

class Animal {
    Animal(){
        this(2);
        System.out.println("1");
    }
    Animal(int i){
        System.out.println(i);
    }
}

class Dog extends Animal{
    Dog(){
        this("4");
        System.out.println("3");
    }
    Dog(int i){
        System.out.println("welcome");
    }
    Dog(String i){
        System.out.println(i);
    }
}

public class hello {
    public static void main(String[] args) {
        Dog obj = new Dog();
    }
}