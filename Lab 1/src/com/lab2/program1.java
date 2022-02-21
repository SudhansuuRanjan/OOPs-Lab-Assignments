package com.lab2;

import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check if it is even or odd : ");
        int n = in.nextInt();

        if(n % 2 == 0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}
