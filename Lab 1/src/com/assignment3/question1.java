package com.assignment3;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an Year to check if it is leap year or not : ");
        int year = in.nextInt();
        isLeapYear(year);
    }

    private static void isLeapYear(int year) {
        if(year % 400 == 0){
            System.out.println("Giver year is leap year.");
        }else if( year % 100 ==  0){
            System.out.println("Given year is not a leap year.");
        }else if(year % 4 == 0){
            System.out.println("Given year is leap year.");
        }else{
            System.out.println("Given year is not a leap year.");
        }
    }


}
