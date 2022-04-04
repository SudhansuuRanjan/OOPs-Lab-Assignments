package com.lab6;

public class question2 {
    static class Student{
        String name;
        final int rollno;
        static int SerialNo = 0;

        Student(int rollno , String name) {
            this.rollno = rollno;
            this.name = name;
            SerialNo++;
            this.getInfo();
        }

        void getInfo(){
            System.out.println("Serial no. : "+ SerialNo +"\nName : "+ name + "\nRoll no : " + rollno +"\n");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(2002001 , "Aarushi");
        Student s2 = new Student(2002002 , "Diwakar");
        Student s3 = new Student(2002003 , "Prabhakar");
        Student s4 = new Student(2002004 , "Varsha");
        Student s5 = new Student(2002005 , "Indrajeet");
        Student s6 = new Student(2002006 , "Abhijeet");
        Student s7 = new Student(2002007 , "Sudhanshu");
        Student s8 = new Student(2002008 , "Deepak");
        Student s9 = new Student(2002009 , "Aadarsh");
        Student s10 = new Student(2002010 , "Shweta");
    }
}
