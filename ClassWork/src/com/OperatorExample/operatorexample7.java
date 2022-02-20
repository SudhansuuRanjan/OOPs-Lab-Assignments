package com.OperatorExample;

public class operatorexample7 {
    public static void main(String[] args) {
        int a = 10;
        int b = -10;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(~a));
        System.out.println(Integer.toBinaryString(~a+1));
        System.out.println(Integer.toBinaryString(b));
    }
}

//1010
//11111111111111111111111111110101
//11111111111111111111111111110110
//11111111111111111111111111110110