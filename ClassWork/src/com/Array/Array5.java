package com.Array;

public class Array5 {
    public static void main(String[] args) {
        int arr[][] = {{34, 87, 39}, {31, 65, 12}, {27, 64, 29}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
