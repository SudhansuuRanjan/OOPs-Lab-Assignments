package com.lab2;

import java.util.Scanner;

public class program13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int k = in.nextInt();
        System.out.print("Enter second number : ");
        int l = in.nextInt();
        System.out.print("Enter third number : ");
        int m = in.nextInt();

        System.out.println("Max is : ");
        if( k > l && k > m){
            System.out.print(k);
        }else if( l > m && l > m){
            System.out.print(l);
        }else{
            System.out.print(m);
        }
    }
}
