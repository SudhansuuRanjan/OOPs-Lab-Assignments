package com.lab3;

public class question09 {

    public static void main(String[] args) {

        int j = 9;
        while(j > 0){
            int i = 9 - j;
            while(i < 9){
                System.out.print(" ");
                i++;
            }

            int k = j;
            while(k <= 9){
                System.out.print("* ");
                k++;
            }
            System.out.print("\n");
            j-=2;
        }
    }

}
