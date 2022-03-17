package com.lab4;

public class Question5 {
    public static class Sum{
        int a ;
        int b ;
        int c ;

        Sum(int x , int y , int z){
            a = x ;
            b = y;
            c = z ;
        }
        void Compute(){
            System.out.println("Sum : " + (a + b + c));
        }
    }

    public static void main(String[] args) {
        Sum s1 = new Sum(12 , 14 , 18);
        s1.Compute();
    }
}
