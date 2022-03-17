package com.assignment3;

public class question2 {
    public static class Patient{
        String name ;
        int RegNo ;
        int age;
        Boolean needBlood = false ;
        String treatmentType;
        String BloodGroup ;
        double totalBill = 0;

        void patientDetails(String name , int RegNo , int age, Boolean needBlood , String treatmentType , String BloodGroup){
            this.name = name;
            this.RegNo = RegNo;
            this.needBlood = needBlood;
            this.treatmentType = treatmentType;
            this.BloodGroup = BloodGroup;
            this.age = age;
        }

        void showPatient(){
            System.out.println("Name : " + name);
            System.out.println("Registration no : " + RegNo);
            System.out.println("Need Blood : " + needBlood);
            System.out.println("Treatment Type : " + treatmentType);
            System.out.println("Blood Group : " + BloodGroup);
        }

        void bloodNeed(){
            if(needBlood){
                switch (BloodGroup) {
                    case "A +ve" -> totalBill += 10000;
                    case "A -ve" -> totalBill += 12000;
                    case "B +ve" -> totalBill += 8000;
                    case "B -ve" -> totalBill += 9000;
                    case "O +ve" -> totalBill += 8500;
                    case "O -ve" -> totalBill += 15000;
                    case "AB +ve" -> totalBill += 7000;
                    case "AB -ve" -> totalBill += 11000;
                }
            }
        }

        void treatment(){
            switch (treatmentType) {
                case "Medications" -> totalBill += 45000;
                case "Surgery" -> totalBill += 100000;
                case "Medical Devices" -> totalBill += 30000;
                case "Psychotherapy" -> totalBill += 25000;
            }
        }

        void discount(){
           if(age > 60){
               totalBill -= ( totalBill * 20 ) / 100 ;
           }
        }

        void showBill() {
            System.out.println("\n\nTotal Bill : "+ totalBill);
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient();
        p1.patientDetails("Priyanshu" , 2021 , 65,true , "Medications" , "B +ve");
        p1.showPatient();
        p1.bloodNeed();
        p1.treatment();
        p1.discount();
        p1.showBill();
    }
}
