package com.Array;

public class Array11 {
    public static void main(String[] args) {

        int my_arr[][][] = {{{1, 2, 3}, {4, 6}, {7, 8, 9}}};
        System.out.println("3D Array is : ");

        for (int Arr_2D[][]: my_arr) {
            for (int Arr_1D[]: Arr_2D) {
                for (int element: Arr_1D) {
                    System.out.print(element + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}
