package com.assignment3;

public class question3 {
    public static class Student{
        int ID;
        String name;
        int mark;

        Student(){
            System.out.println("Unknown");
        }

        Student(int ID , String name , int mark){
            this.ID = ID;
            this.name = name;
            this.mark = mark;
        }

        void display(){
            if(name == null && mark == 0 && ID == 0){
                System.out.println("\nID : " + "Unknown" + "\nname : " + "Unknown" + "\nmarks : " + "Unknown" );
                return ;
            }
            System.out.println("\nID : " + ID + "\nname : " + name + "\nmarks : " + mark );
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 =  new Student(2002006 , "Sudhanshu" , 98);

        s1.display();
        s2.display();
    }
}
