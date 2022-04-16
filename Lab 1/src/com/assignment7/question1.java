package com.assignment7;

import java.util.Scanner;

class Player {
    void checkLevel(int xp) throws UserExp {
        if( xp < 50){
            throw new UserExp();
        }else{
            System.out.println("You Passed the level");
        }
    }
}

public class question1 {
    public static void main(String[] args) throws UserExp {
        Scanner in = new Scanner(System.in);
        Player p1 = new Player();
        System.out.println("Enter your XPs : ");
        int xp = in.nextInt();
        p1.checkLevel(xp);
    }
}

class UserExp extends Exception{
    UserExp(){
        System.out.println("You failed the level. Try again to score more than 50XP.");
    }
}
