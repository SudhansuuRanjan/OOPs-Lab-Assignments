package com.variableExample;

public class ngc {
    static class Test{
        int x;

        private Test(){
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println(obj.x);
    }
}
