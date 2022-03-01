package com.lab3;

//Infinite loop using for loop

public class question02 {
    public static void main(String[] args) {
        int k = 1 , i = 2;
        while (++i < 6){
            k *= i;
            System.out.println(k);
        }
    }
}
