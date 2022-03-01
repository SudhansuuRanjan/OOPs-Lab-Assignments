package com.sudhanshu;

import java.util.Scanner;

public class guessingGame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rand = (int) (Math.random()*(100 - 1 + 1) + 1);
        int num ;

        System.out.println("-- Guess the number --");

        do{
            System.out.print("\nEnter a number : ");
            num = in.nextInt();
            if(num > 100 || num < 0){
                System.out.println("Result : Invalid input !");
                continue;
            }else if(rand - num > 0){
                System.out.println("Result : Too small");
            }else if( rand - num < 0){
                System.out.println("Result : Too large");
            }else{
                System.out.println("You guessed it right !!");
                break;
            }

        }while(num != rand);
    }
}
