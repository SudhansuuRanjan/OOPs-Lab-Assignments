package com.lab3;

public class question12 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0 ; i < 10; i++) {
            arr[i] = i;
        }

        for (int i = 0; i <= 10 ; i++) {
            System.out.println((arr[i]+1)*2);
        }

    }
}
