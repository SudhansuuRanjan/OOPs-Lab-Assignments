package com.lab4;

import java.util.Scanner;

public class Question2 {

    public static class Circle{
        int radii;
        static int count;

        Circle(int radii){
            this.radii = radii;
            count++;
        }

        void Circumference(){
            System.out.println("Circumference : " + (2 * 3.14 * radii));
        }

        void Area(){
            System.out.println("Area : " + (3.14 * radii * radii));
        }

        void Count(){
            System.out.println(count);
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter Radii of circle : ");
            int radii = in.nextInt();

            Circle c1 = new Circle(radii);
            Circle c2 = new Circle(radii);
            c1.Area();
            c1.Circumference();

            c2.Count();
        }
    }
}
