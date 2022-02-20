package com.OperatorExample;

public class operatorexample8 {
    public static void main(String[] args) {
        int a = 10;
        int b = -10;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(a>>>2));
        System.out.println(b);
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(b = b >>>2));
        System.out.println(Integer.toBinaryString(b));
    }
}

//1010
//10
//-10
//11111111111111111111111111110110
//111111111111111111111111111101
//111111111111111111111111111101