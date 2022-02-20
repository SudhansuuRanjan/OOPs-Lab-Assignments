package com.variableExample;

public class LocalVariable {
    void CountAge(){
        int age = 18;
        age += 5;
        System.out.println("Student's age is : " + age);
    }

    public static void main(String[] args) {
        LocalVariable obj = new LocalVariable();
        obj.CountAge();
    }
}

//  Student's age is : 23