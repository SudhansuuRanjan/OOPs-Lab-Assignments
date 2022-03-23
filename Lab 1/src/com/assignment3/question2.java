package com.assignment3;

import java.util.Scanner;

public class question2 {
    public static class Patient{
        String name ;
        int RegNo ;
        int age;
        Boolean needBlood = false ;
        int[] treatmentType = new int[4];
        String BloodGroup ;
        private double totalBill = 0;

        void patientDetails(String name , int RegNo , int age, Boolean needBlood , int[] treatmentType , String BloodGroup){
            this.name = name;
            this.RegNo = RegNo;
            this.needBlood = needBlood;
            this.treatmentType = treatmentType;
            this.BloodGroup = BloodGroup;
            this.age = age;
        }

        void showPatient(){
            System.out.println("\n\n---- Patient Details ----");
            System.out.println("Name : " + name);
            System.out.println("Registration no : " + RegNo);
            System.out.println("Need Blood : " + needBlood);
            System.out.print("Treatment Type : ");
            for (int i = 0; i < 4; i++) {
               if(i == 0 && treatmentType[i] == 1){
                   System.out.print("Medications,");
               }
                if(i == 1 && treatmentType[i] == 1){
                    System.out.print(" Surgery,");
                }
                if(i == 2 && treatmentType[i] == 1){
                    System.out.print(" Medical Devices,");
                }
                if(i == 3 && treatmentType[i] == 1){
                    System.out.print(" Psychotherapy");
                }
            }
            System.out.println("\nBlood Group : " + BloodGroup);
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
            for (int i = 0; i < 4; i++) {
                if(treatmentType[i] == 1){
                    switch (i) {
                        case 0 -> totalBill += 45000; // Medications
                        case 1 -> totalBill += 100000; // Surgery
                        case 2 -> totalBill += 30000;  // Medical Devices
                        case 3 -> totalBill += 25000;  // Psychotherapy
                    }
                }
            }
        }

        void discount(){
            System.out.println("\n---- Patient Invoice ----");
           if(age > 60){
               totalBill -= ( totalBill * 20 ) / 100 ;
               System.out.print("You are eligible for 20% Discount. Discount Applied !!");
           }else{
               System.out.print("Discount Not Applicable !!");
           }
        }

        void showBill() {
            System.out.print("\nTotal Bill : ₹"+ totalBill);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Patient p1 = new Patient();
        System.out.println("Welcome to Hospital Dashboard !!\nRegister now to avail facilities!!\n");
        System.out.print("---- Registration Form ----\nEnter patient's name : ");
        String pName = in.nextLine();
        System.out.print("Enter Patients Blood Group : ");
        System.out.print("\n( A +ve, A -ve, B +ve, B -ve, AB +ve, AB -ve, O +ve, O -ve) : ");
        String pBloodGrp = in.nextLine();
        System.out.print("Enter patient's Registration no. : ");
        int pRegNo = in.nextInt();
        System.out.print("Enter patient's age : ");
        int pAge = in.nextInt();
        System.out.print("Does the patient need blood ? (true/false) : ");
        Boolean pNeedBlood = in.nextBoolean();
        System.out.print("Enter treatment types : ( if applicable enter 1 else enter 0) \n");
        int[] arr = new int[4];
        for (int i = 0; i < 4 ; i++) {
            if(i == 0){
                System.out.print("Medications : ");
                arr[i] = in.nextInt();
            }
            if(i == 1){
                System.out.print("Surgery : ");
                arr[i] = in.nextInt();
            }
            if(i == 2){
                System.out.print("Medical Devices : ");
                arr[i] = in.nextInt();
            }
            if(i == 3){
                System.out.print("Psychotherapy : ");
                arr[i] = in.nextInt();
            }
        }

        p1.patientDetails(pName , pRegNo , pAge,pNeedBlood , arr , pBloodGrp);
        p1.showPatient();
        p1.bloodNeed();
        p1.treatment();
        p1.discount();
        p1.showBill();
    }
}
