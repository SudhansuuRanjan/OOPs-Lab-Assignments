package com.lab4;

public class Question1 {

    public static class Compute{
        int a ;
        int b ;
        int c;

        Compute(int x , int y , int z){
            a = x ;
            b = y;
            c = z ;
        }
        void sum(){
            System.out.println("Sum : " + (a + b + c));
        }
        void average(){
            System.out.println("Average : " + (a + b + c )/3);
        }
    }

    public static void main(String[] args) {
        Compute c1 = new Compute(12 , 14 , 18);
        c1.sum();
        c1.average();
    }
}
