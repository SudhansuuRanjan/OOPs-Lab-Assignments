package com.assignment6;

interface Test{
    String address = "NITP CAMPUS";
    void mvU();
    void mvL();
    void mvR();
    void mvD();
}

class Company1 implements Test{
    int workers ;
    String name ;
    String Owner ;
    String CompanyType ;

    Company1(int workers , String name , String Owner , String CompanyType){
        this.workers = workers;
        this.name = name ;
        this.CompanyType = CompanyType;
        this.Owner = Owner;

        System.out.println("\nCompany Name : " + name);
        System.out.println("Company Type : " + CompanyType);
        System.out.println("No of employees : " + workers);
        System.out.println("Owner : " + Owner);
        System.out.println("Address : "+ address);
    }

    void message(String direction){
        System.out.println("Moved : " + direction);
    }
    public void mvD() {
        message("Down");
    }
    public void mvL(){
        message("Left");
    }
    public void mvR(){
        message("Right");
    }
    public void mvU(){
        message("Up");
    }
}

class Company2 implements Test{
    int workers ;
    String name ;
    String Owner ;
    String CompanyType ;

    Company2(int workers , String name , String Owner , String CompanyType){
        this.workers = workers;
        this.name = name ;
        this.CompanyType = CompanyType;
        this.Owner = Owner;

        System.out.println("\nCompany Name : " + name);
        System.out.println("Company Type : " + CompanyType);
        System.out.println("No of employees : " + workers);
        System.out.println("Owner : " + Owner);
        System.out.println("Address : "+ address);
    }

    void message(String direction){
        System.out.println("Moved : " + direction);
    }
    public void mvD() {
        message("Down");
    }
    public void mvL(){
        message("Left");
    }
    public void mvR(){
        message("Right");
    }
    public void mvU(){
        message("Up");
    }
}



public class question2 {
    public static void main(String[] args) {
        Company1 c1 = new Company1(10, "TCS Co." , "Suyel" , "Technology");
        c1.mvD();
        c1.mvL();
        c1.mvR();
        c1.mvU();
        Company1 c2 = new Company1(12, "TATA Co." , "Suyel" , "Multi Tech");
        c2.mvD();
        c2.mvL();
        c2.mvR();
        c2.mvU();
    }
}