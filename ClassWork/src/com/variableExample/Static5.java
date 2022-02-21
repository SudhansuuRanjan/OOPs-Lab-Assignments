package com.variableExample;

public class Static5 {
    static int x = 100;
    String str;
    public static void main(String[] args) {
        Static5 obj1 = new Static5();
        Static5 obj2 = new Static5();

        obj1.x = 200;
        obj1.str = "We are in obj1";

        obj2.x = 300;
        obj1.str = "We are in obj2";

//        System.out.println(str);

    }
}
