package com.assignment2;

import java.util.Scanner;

public class question1b {
    public static void main(String[] args) {
        System.out.print("Enter the number of line you want to print : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n ; i++) {
            int temp = 1;
            for (int j = n-i ; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(temp + " ");
                temp = temp * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
