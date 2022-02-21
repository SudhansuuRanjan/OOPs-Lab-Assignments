package com.lab2;

import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks to get grades : ");
        int marks = in.nextInt();
        String grade;
        if(marks >= 90 && marks < 100){
            grade = "A+";
        }else if( marks >= 80 && marks < 90){
            grade = "A";
        }else if( marks >= 70 && marks < 80){
            grade = "B";
        }else if( marks >= 60 && marks < 70){
            grade = "C";
        }else if( marks >= 50 && marks < 60){
            grade = "D";
        }else if( marks < 50 ){
            grade = "Fail";
        }else{
            grade = "invalid";
        }

        if(grade == "Fail" || grade == "invalid"){
            System.out.println(grade);
        }else{
            System.out.println(grade + "\tgrade");
        }
    }
}
