package com.variableExample;

public class StaticBlock {
    static int x ;
    static String str;
        static
        {
            System.out.println("We are in static block");
            x = 100;
            System.out.println(x);
            int x = 300;
            System.out.println(x);
;        }

    public static void main(String[] args) {
        System.out.println(x);
    }
}
