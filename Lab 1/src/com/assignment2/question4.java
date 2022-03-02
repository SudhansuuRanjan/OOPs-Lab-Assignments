package com.assignment2;

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {{1, 5, 7}, {1,6,2,6}, {1,2},{1,5,6,7},{7,2,8}};
        int columns = arr.length;

        System.out.println("Given 2D array : ");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nLength of Rows");
        for (int i = 0; i < columns ; i++) {
            System.out.println("Length of Row " + (i+1) + " : " + arr[i].length);
        }
    }
}