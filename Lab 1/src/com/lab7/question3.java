package com.lab7;

public class question3 {
    public static void main(String[] args) {
        try {
           int  x = 100/0;
            System.out.println(x);
        }catch(Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Invalid\n");
        }

        try{
            int x = 6;
            String s = "Hello";
            x = Integer.parseInt(s);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Format Mismatch");
        }
    }
}
