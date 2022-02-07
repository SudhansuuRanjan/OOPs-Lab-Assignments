package com.sudhanshu;

public class OperatorEx3 {
    public static void main(String[] args) {
        int a = 10;
        int b = -10;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(a>>>2));
        System.out.println(b);
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(b = b >>> 2));
        System.out.println(b);
        System.out.println(a);
    }
}
