package com.lab2;

import java.util.Scanner;

public class program10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to get table : ");
        int n = in.nextInt();

        System.out.println("Table of " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println( n + " x " + i + " = " + n*i );
        }
    }
}
