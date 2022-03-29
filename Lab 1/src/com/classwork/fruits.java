package com.classwork;

public class fruits {
    String SeasonType ;
    int number;

    fruits(String SeasonType){
      this.SeasonType = SeasonType;
    }

    fruits(String SeasonType , int number){
        this.SeasonType = SeasonType;
        this.number = number;
    }


    public static void main(String[] args) {
        System.out.println("Hello");
        fruits mango = new fruits("Summer Fruits");
        fruits apple = new fruits("Summer Fruits" , 23);
        System.out.println(mango.SeasonType);
        System.out.println(apple.number);
    }
}
