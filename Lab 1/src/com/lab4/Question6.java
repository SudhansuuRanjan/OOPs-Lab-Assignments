package com.lab4;

public class Question6 {
    String name;
    String college = "NITP";
    int roll ;

    Question6(String name , String College , int roll ){
        this.name = name;
        this.college = College;
        this.roll = roll ;
    }

    Question6(String name , int roll ){
        this.name = name;
        this.roll = roll ;
    }

    void display(){
        System.out.println(name + " " + college + " " + roll);
    }

    public static void main(String[] args) {
        Question6 n1 = new Question6("Sudhanshu" , 2002006);
        n1.display();
        Question6 n2 = new Question6("RahulNath" , "IITP" ,1900002);
        n2.display();
    }


}
