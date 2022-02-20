package com.Array;

public class Array10 {
    public static void main(String[] args) {
        int my_arr[][][] = {{{1,2,3},{4,5,6},{7,8,9}}};
        for (int i = 0; i < 1 ; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.println("my_arr [" + i + " , "  + j + " , " + k + "] : " + my_arr[i][j][k] );
                }
                System.out.println();
            }
        }
    }
}
