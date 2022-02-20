package com.ConditionalStatements;

public class IfStatement1 {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 60;
        if( num1 < num2){
            System.out.println("num1 is less than num2");
        }
        num1 = 60;
        num2 = 50;
        System.out.println("Value of num1 : " + num1 + " , " + "Value of num2 : " + num2);
        if(num1 < num2){
            System.out.println("num1 is less than num2");
        }
    }
}
