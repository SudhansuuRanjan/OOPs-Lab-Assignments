package com.assignment1;

import java.util.Scanner;

public class question02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = in.nextInt();
        System.out.print("Enter second number : ");
        int b = in.nextInt();
        System.out.print("Enter third number : ");
        int c = in.nextInt();

        int max = a > b ? ( a > c ? a : c) : (b > c ? b : c);
        System.out.println("Maximum is : " + max);
    }
}
