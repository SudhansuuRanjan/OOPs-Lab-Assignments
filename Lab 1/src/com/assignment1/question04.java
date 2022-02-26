package com.assignment1;

import java.util.Scanner;

public class question04 {
    public static void main(String[] args) {
        System.out.println("---- Program to get HCF & LCM ----");
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter first number : ");
        int a = in.nextInt();
        System.out.print("Enter second number : ");
        int b = in.nextInt();
        int hcf = 0 , lcm = a > b ? a : b;

        int i = 1;
        while( i <= a || i <= b ){
            if( a % i == 0 && b % i == 0){
                hcf = i ;
            }
            i++;
        }

        System.out.println("\nHCF is : " + hcf);

        while(true){
            if( lcm % a == 0 && lcm % b == 0){
                System.out.println("LCM is : " + lcm);
                break;
            }
            lcm++;
        }

    }
}
