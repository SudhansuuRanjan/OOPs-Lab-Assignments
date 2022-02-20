package com.OperatorExample;

public class operatorexample3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a < b && a < c);
        System.out.println(a < b & a < c);
        System.out.println(a < b || a < c);
        System.out.println(a < b | a < c);
        System.out.println(a < b || a++ < c);
        System.out.println(a);
        System.out.println(a > b | a++ < c);
        System.out.println(a);
    }
}

//false
//false
//true
//true
//true
//11
//true
//12
