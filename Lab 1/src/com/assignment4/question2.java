package com.assignment4;

public class question2 {
    static class Car{
        String model;
        String brand;
        RangeRover r;
        String manufacturingDate ;

        Car(){
            this("F1" , "Ferrari");
            System.out.println("2. Using this Keyword To Invoke the Current class Constructor by this.");
            disp(this);
        }

        Car(String model , String brand) {
            System.out.println("1. Using this keyword to refer the Current Class Instance Variable.");
            this.model = model;
            this.brand = brand;
        }

        public Car(RangeRover rangeRover) {
            this.r = rangeRover;
            System.out.println("3. Using this Keyword To Pass as an Argument in the Constructor Call.");
        }

        void getDate(String manufacturingDate) {
            this.manufacturingDate = manufacturingDate;
        }

        void display(){
           this.getDate("22 Jan 2022");
           System.out.println("4. Using this Keyword to Invoke the Current Class Method (Implicitly).");
        }

        void disp(Car c1){
            System.out.println("5. Using this Keyword To Pass as an Argument in the Method.");
        }

        void getCar(){
            System.out.println("Brand : " + brand);
            System.out.println("Model : " + model);
        }

        Car get(){
            System.out.println("6. Using this Keyword To Return the Current Class Instance from the Method.");
            return this;
        }
    }

    static class RangeRover{
        String model;
        String brand = "Range Rover";
        RangeRover(){
           Car c2 = new Car(this);
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display();
        RangeRover c3 = new RangeRover();
        Car c4 = c1.get();
    }
}
