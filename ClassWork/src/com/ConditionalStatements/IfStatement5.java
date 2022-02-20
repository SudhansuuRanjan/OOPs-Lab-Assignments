package com.ConditionalStatements;

public class IfStatement5 {
    public static void main(String[] args) {
        int num = 50;
        if(num < 20){
            System.out.println("num is less than 20");
        }
        else if(num < 30){
            System.out.println("Number is less than 30 too");
        }else{
            System.out.println("Number is less than 40 too");
        }
    }
}
