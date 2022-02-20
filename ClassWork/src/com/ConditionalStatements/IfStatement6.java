package com.ConditionalStatements;

public class IfStatement6 {
    public static void main(String[] args) {
        int marks = 81;
        char grade;
        if(marks >= 90){
            grade = 'S';
        }else if( marks >= 80){
            grade = 'A';
        }else if( marks >= 70){
            grade = 'B';
        }else if( marks >= 60){
            grade = 'C';
        }else if( marks >= 50){
            grade = 'D';
        }else if( marks >= 40){
            grade = 'P';
        }else{
            grade = 'F';
        }

        System.out.println("Grade : " + grade);
    }
}
