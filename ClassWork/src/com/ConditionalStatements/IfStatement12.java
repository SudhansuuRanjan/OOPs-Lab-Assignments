package com.ConditionalStatements;

public class IfStatement12 {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 60;
        if( num1 < num2){
            System.out.println("num1 is less than num2");
            if(num1 < 100){
                System.out.println("num is less than 100");
            }
        }
    }
}
