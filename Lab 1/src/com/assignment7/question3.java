package com.assignment7;

public class question3 {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            soln(i);
        }
    }

    static void soln(int a){
        try{
            switch (a){
                case 1 -> throw new IndexOutOfBoundsException("Index out of bound");
                case 2 -> throw new NullPointerException("Null pointer exception");
                case 3 -> throw new ArithmeticException("Divide by zero");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
