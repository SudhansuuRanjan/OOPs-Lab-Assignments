package com.assignment3;

public class question3 {
    public static class Student{
        int ID;
        String name;
        int mark;
        Boolean initByDefaultConstructor = true;

        Student(){
            System.out.println("Unknown");
            initByDefaultConstructor = true;
        }

        Student(int ID , String name , int mark){
            this.ID = ID;
            this.name = name;
            this.mark = mark;
            initByDefaultConstructor = false;
        }

        void display(){
            if(initByDefaultConstructor){
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
