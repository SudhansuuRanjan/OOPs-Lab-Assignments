package com.lab4;

public class Question7 {
    String name ;
    int roll;
    static int count;

    Question7(String name , int roll){
        this.name = name ;
        this.roll = roll;
        count++;
    }

    static void total(){
        System.out.println("Total no of students in the class = " + count);
    }

    public static void main(String[] args) {
        Question7 s1 = new Question7("A" , 1);
        Question7 s2 = new Question7("B" , 2);
        Question7 s3 = new Question7("C" , 3);
        Question7 s4 = new Question7("D" , 4);
        Question7 s5 = new Question7("E" , 5);
        Question7 s6 = new Question7("F" , 6);
        Question7 s7 = new Question7("G" , 7);

        Question7.total();
    }
}
