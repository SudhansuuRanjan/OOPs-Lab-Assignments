package com.lab2;

import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to get month : ");
        int num = in.nextInt();
        String day = switch (num) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Input : Enter a number between 1 to 12";
        };
        System.out.println(day);
    }
}
