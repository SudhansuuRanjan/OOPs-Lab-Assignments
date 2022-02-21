package com.variableExample;

public class static12 {
    int id;
    String name;
    //creating a parameterized constructor
    static12(int i,String n){
        id = i;
        name = n;
    }
    //method to display the values
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){
        //creating objects and passing values
        static12 s1 = new static12(111,"Karan");
        static12 s2 = new static12(222,"Aryan");
        //calling method to display the values of object
        s1.display();
        s2.display();
    }
}
