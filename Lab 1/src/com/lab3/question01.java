package com.lab3;

import java.util.Scanner;

public class question01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = 10 , sum = 0;
        System.out.println("Enter 10 numbers ");
        while(t > 0){
            int num = in.nextInt();
            sum += num;
            t--;
        }
        System.out.println("Sum is : " + sum);
        System.out.println("Average  is : " + sum / 10);
    }
}
