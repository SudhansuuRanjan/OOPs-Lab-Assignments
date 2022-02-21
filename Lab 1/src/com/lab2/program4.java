package com.lab2;

import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length : ");
        int length = in.nextInt();
        System.out.print("Enter breadth : ");
        int breadth = in.nextInt();

        if(length > breadth || breadth > length){
            System.out.println("Not a square.");
        }else{
            System.out.println("It is a square.");
        }
    }
}
