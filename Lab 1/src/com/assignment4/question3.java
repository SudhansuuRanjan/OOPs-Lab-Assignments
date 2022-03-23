package com.assignment4;

public class question3 {
   static class Employee{
       int salary = 10000;
       String name ;

       Employee(String name){
           this.name = name;
       }

       void printSalary(){
           System.out.println("---- Employee Info ----");
           System.out.println("Employee's Salary : ₹" + salary);
       }
   }

   static class Manager extends Employee{

       Manager(String name) {
           super(name);
           salary+= 1000;
       }
   }

    public static void main(String[] args) {
        Employee e1 = new Employee("Ramesh");
        e1.printSalary();

        Employee m1 = new Manager("raj");
        m1.printSalary();
    }
}
