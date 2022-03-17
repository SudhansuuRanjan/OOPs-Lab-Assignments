package com.lab4;

public class Question3 {
    static int area(int a){
        return (a * a);
    }

    static int area(int a , int b){
        return ( a * b);
    }

    public static void main(String[] args) {
        System.out.println("Area of Square : " + area(2 ));
        System.out.println("Area of Rectangle : " + area(2 , 5 ));
    }

}
