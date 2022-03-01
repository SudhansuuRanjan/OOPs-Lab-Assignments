package com.lab3;

import java.util.Scanner;

public class question13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = in.nextInt();
        System.out.println("Enter array elements : ");
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0 ; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < n ; i++) {
            sum += arr[i];
        }

        System.out.println("Sum is : " + sum);
        System.out.println("Aerage is : " + sum / n);
    }
}
