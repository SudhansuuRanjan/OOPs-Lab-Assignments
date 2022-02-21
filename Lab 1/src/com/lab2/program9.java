package com.lab2;

import java.util.Scanner;

public class program9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to get factorial : ");
        int n = in.nextInt();
        long fact = 1;

        for (int i = n; i >= 1; i--) {
            fact *= i ;
        }

        System.out.println("factorial : " + fact);

    }
}
