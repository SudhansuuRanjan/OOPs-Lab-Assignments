package com.assignment1;

import java.util.Scanner;

public class question01 {
    public static void main(String[] args) {
        System.out.println("Enter a number n to get Fibonacii series of n terms : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int fibo = 1 , prev = 0;
        if(num == 1){
            System.out.println(prev);
        }else if( num == 2){
            System.out.println(prev);
            System.out.println(fibo);
        }else{
            System.out.println(prev);
            System.out.println(fibo);
            for (int i = 0; i < num-2 ; i++) {
                fibo = fibo + prev;
                prev = fibo - prev;
                System.out.println(fibo);
            }
        }
    }

}
