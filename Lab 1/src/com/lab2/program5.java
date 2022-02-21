package com.lab2;

import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to get day : ");
        int num = in.nextInt();
        String day = switch (num) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid Input : Enter a number between 1 to 7";
        };
        System.out.println(day);
    }
}
