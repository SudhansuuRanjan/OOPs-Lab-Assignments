package com.variableExample;

public class static1{
    static int x = 100;
    int y = 200;

    void display(){
        System.out.println(x);
        System.out.println(y);
        System.out.println("instance method");
    }

    static void show(){
        System.out.println(x);
        System.out.println("static method");
    }

    public static void main(String[] args) {
        static1 obj = new static1();
        obj.display();
        static1 obj1 = null ;
        obj1.show();
        int z = obj1.x;
        System.out.println(z);
    }
}
