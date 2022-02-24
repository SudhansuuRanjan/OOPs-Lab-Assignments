package com.methodOverloading;

import java.lang.reflect.Method;

public class example1 {
    void sum(int a , int b){
        System.out.println("sum : " + (a + b));
    }
    void sum(float a , float b){
        System.out.println("sum : " + (a + b));
    }
    public static void main(String[] args) {
        example1 obj = new example1();
        obj.sum(2 , 3);
        obj.sum(0.4f, 0.5f);
    }
}
