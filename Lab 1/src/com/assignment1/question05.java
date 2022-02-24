package com.assignment1;

import java.util.Scanner;

public class question05 {
    int gre;
    int toefl;

    question05 ( int gre , int toefl){
        this.gre = gre;
        this.toefl = toefl;
    }

    void getUniversity(){
        String univ , dept = "Not Eligible";
        if(gre > 70 && toefl >= 50){
            univ = "Oxford University";
            if(toefl >= 70){
                dept = "Computer Sc. and Engg.";
            }else if( toefl >= 60){
                dept = "Electronics Engg.";
            }else if(toefl >= 50){
                dept = "Electrical Engg.";
            }
        }else if(toefl >= 50 && gre >= 50){
            univ = "MIT";
            if(gre <= 70 && gre >= 60){
                dept = "Computer Sc. and Engg.";
            }else if( gre <= 59 && gre >50){
                dept = "Chemical Engg.";
            }else if( gre == 50){
                dept = "Civil Engg.";
            }
        }else{
            univ = "Not Eligible";
            dept = "Not Eligible";
        }
        System.out.println("\nUniversity : " + univ);
        System.out.println("Department : " + dept);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("-- Program to get University & Department --");
        System.out.print("\nEnter your GRE %ge : ");
        int gre = in.nextInt();
        System.out.print("Enter your TOEFL %ge : ");
        int toefl = in.nextInt();

        question05 s1 = new question05( gre , toefl);
        if(s1.gre > 100 || s1.gre < 0 || s1.toefl > 100 || s1.toefl < 0){
            System.out.println("\nInvalid Input !!");
        }else{
            s1.getUniversity();
        }
    }
}
