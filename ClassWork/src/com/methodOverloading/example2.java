package com.methodOverloading;

public class example2 {
    void sum(char a){
        System.out.println(a);
    }
    void sum(int a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        example2 obj = new example2();
        obj.sum('A');
        obj.sum(36);
    }
}
