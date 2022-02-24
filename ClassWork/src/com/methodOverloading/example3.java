package com.methodOverloading;

public class example3 {
    static int sum(int a , int b){
        return a + b;
    }
    static double sum(double a , double b){
        return a + b;
    }

    public static void main(String[] args) {
        example3 s = new example3();
        System.out.println(s.sum(2,3));;
        System.out.println(s.sum(0.3,0.5));;
    }
}
