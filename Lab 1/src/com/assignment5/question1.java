package com.assignment5;

class Member{
    String Name;
    int Age;
    long PhoneNo ;
    String Address;
    int Salary;

    Member(String Name , int Age , long PhoneNo , String Address, int Salary){
      this.Name = Name;
      this.Salary = Salary;
      this.Address = Address;
      this.Age = Age;
      this.PhoneNo = PhoneNo;
    }

    void printSalary(){
        System.out.println("Salary : ₹" + Salary);
    }
}

class Employee extends Member{
  String specialization;
  String department;

    Employee(String Name, int Age, long PhoneNo, String Address, int Salary , String specialization , String department) {
        super(Name, Age, PhoneNo, Address, Salary);
        this.specialization = specialization;
        this.department = department;
    }

    void getInfo(){
        System.out.println("\n---- Employee Data ----");
        System.out.println("Name : " + Name);
        System.out.println("Age : " + Age);
        System.out.println("Phone Number : " + PhoneNo);
        System.out.println("Specialization : " + specialization);
        super.printSalary();
        System.out.println("Dept. : "+ department);
        System.out.println("Address : " + Address);
    }
}

class Manager extends Member{
    String specialization;
    String department;

    Manager(String Name, int Age, long PhoneNo, String Address, int Salary, String specialization , String department) {
        super(Name, Age, PhoneNo, Address, Salary);
        this.specialization = specialization;
        this.department = department;
    }

    void getInfo(){
        System.out.println("\n---- Manager Data ----");
        System.out.println("Name : " + Name);
        System.out.println("Age : " + Age);
        System.out.println("Phone Number : " + PhoneNo);
        System.out.println("Specialization : " + specialization);
        super.printSalary();
        System.out.println("Dept. : "+ department);
        System.out.println("Address : " + Address);
    }
}

public class question1 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ram" , 27,99341267,"Delhi, India", 27000, "VLSI" , "ECE");
        Manager m1 = new Manager("Roy" , 32,96741267,"Kolkata, India", 45000, "Power Systems" , "EE");
        e1.getInfo();
        m1.getInfo();
    }
}
