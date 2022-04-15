package com.assignment7;

public class question2 {
    public static void main(String[] args) {
        Integer i1 = 2345; // autoboxing
        printNumber(i1.toString()); // unboxing
//        printNumber(i1);  invalid
          int i2 = i1 ;
//        printNumber(i2); invalid
    }

    static void printNumber(String s){
        System.out.println("Input given : " + s);
    }
}


