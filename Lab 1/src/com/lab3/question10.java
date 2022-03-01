package com.lab3;

public class question10 {
    public static void main(String[] args) {
         int n = 1;
        do{
            int k = n;
            do{
                System.out.print(n + " ");
            }while(--k > 0);
            n++;
            System.out.println();
        }while(n < 6);
    }
}
