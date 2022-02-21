package com.lab2;

import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check if it is positive negative or zero : ");
        int n = in.nextInt();

        if(n == 0){
            System.out.println("Number is zero");
        }else if(n > 0){
            System.out.println("Number is positive");
        }else{
            System.out.println("Number is negative");
        }
    }
}
