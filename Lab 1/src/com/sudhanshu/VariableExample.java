package com.sudhanshu;

public class VariableExample {
    static class Student{
        int rollno;
        String name;
        static String college = "NITP";

        void Student1(int rollno , String name){
            this.rollno = rollno;
            this.name = name;
        }

        void display(){
            System.out.println(rollno+" "+name+" "+college);
        }

    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.Student1(2002006 , "Sudhanshu");
        s2.Student1(2002003 , "Harsh");
        s1.display();
        s2.display();
    }
}
