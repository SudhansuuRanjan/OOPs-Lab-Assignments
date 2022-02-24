package com.assignment1;

public class question03 {
    public static void main(String[] args) {
        int a = 20;
        System.out.println("a : " + (a));
        System.out.println("a in Binary: " + Integer.toBinaryString(a));
        System.out.println("Right Shift operator on a : " + (a >> 2));
        System.out.println("Left Shift operator on a : " + (a << 2));
        System.out.println("Unsigned Right Shift operator on a : " + (a >>> 2));
        System.out.println("Bitwise Compliment on a : " + (~a));

        int c = 40 , d = 30;
        System.out.println("\nc : " + c + "  d : " + d);
        System.out.println("c in bits : " + Integer.toBinaryString(c) +
                "  d in bits: " + Integer.toBinaryString(d));
        System.out.println("Bitwise XOR of c & d : " + (c ^ d));
        System.out.println("Bitwise AND operator : " + (c & d));
        System.out.println("Bitwise OR of c & d in Binary : "+ (c | d));
    }
}
