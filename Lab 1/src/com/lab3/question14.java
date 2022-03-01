package com.lab3;

import java.util.Scanner;

public class question14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println("Enter array elements : ");
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println("2D Array : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
