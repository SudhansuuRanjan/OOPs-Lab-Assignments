package com.lab4;

public class Queation4 {
    static void sum ( int a , int b){
        System.out.println("Sum using first Method : " + (a + b));
    }

    static void sum ( float a , float b){
        System.out.println("Sum using second Method : " + (a + b));
    }

    public static void main(String[] args) {
       sum(2 , 3);
       sum((float) 2.5 , ( float) 5.7);
    }
}
