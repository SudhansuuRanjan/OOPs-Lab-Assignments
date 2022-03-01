package com.lab3;

public class question08 {
    public static void main(String[] args) {
        int num = 100;

        System.out.println("Using for loop");
        for (int i = 0; i < 5; i++) {
            System.out.println(num );
            num = num * 2;
        }

        System.out.println("\nUsing do while loop");
        num = 100;
        do{
            System.out.println(num );
            num = num * 2;
        }while(num <= 1600);
    }
}
