package com.assignment2;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n to find sum : ");
        int n = in.nextInt();
        double sum = 0.0;
        long mul = 1;
        for (int i = 1 ; i <= n; i++) {
            mul *= i;
            sum += (double) i / mul;
            System.out.print( i + "/"+  i + "!");
            if(i < n){
                System.out.print(" + ");
            }else{
                System.out.print(" = ");
            }
        }
        System.out.println(sum);
    }
}
