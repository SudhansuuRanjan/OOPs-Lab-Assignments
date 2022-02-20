package com.variableExample;

public class Student {
    int rollno;
    String name;
    static String college = "NITP";
    void Student1(int r , String n){
        rollno = r;
        name = n;
    }
    void display(){
        System.out.println(rollno + " " + name +" "+ college );
    }

    public static void main(String[] args) {
        Student S1 = new Student();
        Student S2 = new Student();
        S1.Student1(2 , "Aryan");
        S2.Student1(1, "Aakash");
        S1.display();
        S2.display();
    }
}
