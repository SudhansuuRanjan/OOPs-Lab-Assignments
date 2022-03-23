package com.assignment4;

public class question1 {
    public static class Student{
        String name ;
        int ID ;
        String address ;
        int mark;

        Student(){
            name = "Unknown";
            ID = 0;
            address = "NITP Campus";
            mark = 0;
        }

        void disp(String name ,int ID){
            this.name = name ;
            this.ID =  ID;
        }

        void disp(String name ,int ID , String address , int mark){
            this.name = name ;
            this.ID =  ID;
            this.address = address;
            this.mark = mark;
        }

        void display(){
            System.out.println("\nName : " + name + "\naddress : " + address + "\nmark : " + mark + "\nID : " + ID);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(); // initialized using default constructor
        Student s2 = new Student();
        Student s3 = new Student();

        s1.display();
        s1.disp("Amit" ,2001);  // initialized using disp method with two arguments
        s1.display();
        s1.disp("Amit" ,2001 ,"Patna, Bihar" ,98);  // initialized using disp method with all four arguments
        s2.disp("Aarushi" ,2002 ,"New Delhi, India" ,78);
        s3.disp("Alisha" ,2003 ,"Kolkata, West Bengal" ,88);

        s1.display();
        s2.display();
        s3.display();
    }
}
