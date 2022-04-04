package com.lab5;

public class question2 {
    static class Language{
        void  showInfo(){
            System.out.println("Learning a programming language is great thing.");
        }
    }
    static class Java extends Language{
        void  showInfo(){
            System.out.println("Java is a great programming language.");
        }
    }

    public static void main(String[] args) {
        Language cpp = new Language();
        cpp.showInfo();
        Language java = new Java();
        java.showInfo();
    }
}
