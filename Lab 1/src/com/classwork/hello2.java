package com.classwork;

import java.util.Scanner;

public class hello2 {
    int a = 4 , b = 5 ;
    int c = a + b;
    void abc(){
        System.out.println(c);
    }
    public static void main(String[] args) {
        hello2 obj = new hello2();
        obj.abc();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt() ;
        System.out.println(n);
    }
}
