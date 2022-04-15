package com.assignment7;

class Player {
    void checkLevel(int xp) throws ArithmeticException {
        if( xp < 50){
            throw new ArithmeticException("You failed the level.Try again!!");
        }else{
            System.out.println("You Passed the level");
        }
    }
}

public class question1 {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.checkLevel(45);
    }
}
