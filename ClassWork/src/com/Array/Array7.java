package com.Array;

// multiplication of matrices

public class Array7 {
    public static void main(String[] args) {
        int a[][] = {{2, 4, 6}, {8, 10, 12}, {14, 16, 18}};
        int b[][] = {{1, 3, 5}, {7, 9, 11}, {13, 15 , 17}};
        int c[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k]*b[k][j];
                }
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
