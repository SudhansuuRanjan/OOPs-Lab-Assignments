package com.assignment2;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n to find sum : ");
        int n = in.nextInt();
        double sum = 0.0;
        for (int i = 1 ; i <= n; i++) {
            sum += (double) i / fact(i);
            System.out.print( i + "/"+  i + "!");
            if(i < n){
                System.out.print(" + ");
            }else{
                System.out.print(" = ");
            }
        }
        System.out.println(sum);

    }

    private static long fact(int i) {
       if(i >= 1){
           return fact(i-1)*i;
       }else{
           return 1;
       }
    }
}
