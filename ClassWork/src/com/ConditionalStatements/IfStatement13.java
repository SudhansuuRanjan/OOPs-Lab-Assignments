package com.ConditionalStatements;

public class IfStatement13 {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 60;
        if(num1 < num2){
            System.out.println("Num1 is less than Num2");
            if( num1 < 45){
                System.out.println("num is less than 45");
            }else{
                System.out.println("num is greater than 45");
            }
        }
        else{
            System.out.println("num1 is greater tahn num2");
        }
    }
}
