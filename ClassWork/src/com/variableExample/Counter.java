package com.variableExample;

// Instance variable
public class Counter {
    int count = 0;
    void Counter1(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Counter C1 = new Counter();
        Counter C2 = new Counter();
        Counter C3 = new Counter();
        C1.Counter1();
        C2.Counter1();
        C3.Counter1();
    }
}

//1
//1
//1
