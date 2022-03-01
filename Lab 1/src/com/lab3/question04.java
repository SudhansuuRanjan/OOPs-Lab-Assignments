package com.lab3;

public class question04 {
    public static void main(String[] args) {

        System.out.println("Using for loop");

        for (int m = 5 , n = 10 ; n >= 1 ; n--) {
            System.out.println(m*n);
        }

        System.out.println("using while loop");

        int m = 5 , n = 10;
        while( n >= 1){
            System.out.println(m*n);
            n--;
        }

    }
}
