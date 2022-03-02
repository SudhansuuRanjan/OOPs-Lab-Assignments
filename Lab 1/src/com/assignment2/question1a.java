package com.assignment2;

import java.util.Scanner;

public class question1a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no of lines in pattern : ");
        int n = in.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
