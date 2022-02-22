package com.problems;

import java.util.Scanner;

public class DIVIDING {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n , temp = 0;
        n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            temp += arr[i];
        }

        int req = (n * (n + 1)) / 2;
        if(req == temp){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
