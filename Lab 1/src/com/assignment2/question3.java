package com.assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of 1st array & 2nd Array : ");
        int m = in.nextInt();
        int n = in.nextInt();
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        int[] arr = new int[m+n];

        System.out.println("Enter first array elements : ");
        for (int i = 0; i < m; i++)
            arr1[i] = in.nextInt();

        System.out.println("Enter second array elements : ");
        for (int i = 0; i < n; i++)
            arr2[i] = in.nextInt();

        for (int i = 0; i < m + n; i++) {
            if(i < m)
                arr[i] = arr1[i];
            else
                arr[i] = arr2[i - m];
        }
        System.out.println("Concatenated Array : " + Arrays.toString(arr));
    }
}
