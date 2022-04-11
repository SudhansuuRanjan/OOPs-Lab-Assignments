package com.lab7;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("---Program for Division--\nEnter Dividend : ");
        int dividend = in.nextInt();
        System.out.print("Enter Divisor : ");
        int divisor = in.nextInt();
        div(dividend , divisor);
    }

    static void div(int dividend, int divisor){
        try{
            int y = dividend / divisor ;
            System.out.println("Result is : "+  y);
        }catch (Exception e){
            System.out.println("\n--- Arithematic Exception Occured ---\n" + e.getMessage());
        }
    }
}
