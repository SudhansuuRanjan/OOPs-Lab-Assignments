package com.lab3;

public class question06 {
    public static void main(String[] args) {

            for (int j = 9; j > 0; j-= 2) {
                for (int i = 9-j; i < 9; i++) {
                    System.out.print(" ");
                }
                for (int k = j; k <= 9; k++) {
                    System.out.print("* ");
                }
                System.out.print("\n");
            }
    }
}
