package com.variableExample;

public class Student {
    int rollno;
    String name;
    static String college = "ITS";
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
        S1.Student1(111 , "Karan");
        S2.Student1(222, "Aryan");
        S1.display();
        S2.display();
    }
}
