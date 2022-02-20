package com.variableExample;

public class CounterStatic {
    static int count = 0;
    void Counter1(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        CounterStatic C1 = new CounterStatic();
        CounterStatic C2 = new CounterStatic();
        CounterStatic C3 = new CounterStatic();
        C1.Counter1();
        C2.Counter1();
        C3.Counter1();
    }
}

//1
//2
//3