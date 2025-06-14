package com.pushker.learnjava.datatypes;

public class BitwiseOperators {
    public static void main(String[] args) {
        System.out.println("Bitwise oprators:");

        int a=5;//0101
        int b=3;//0011

        System.out.println("AND Operation : "+ "5&3 = "+(a&b));
        System.out.println("Binary: = "+Integer.toBinaryString(a&b));

        System.out.println("OR Operation : "+ "5|3 = "+(a|b));
        System.out.println("Binary: = "+Integer.toBinaryString(a|b));

        System.out.println("XOR Operation : "+ "5^3 = "+(a^b));
        System.out.println("Binary: = "+Integer.toBinaryString(a^b));

        System.out.println("Not Operation : "+ "~a = "+(~a));
        System.out.println("Binary: = "+Integer.toBinaryString(~a));

        System.out.println("Left Shift Operation : "+ "5<<3 = "+(5<<3));
        System.out.println("Binary: = "+Integer.toBinaryString(5<<3));

        System.out.println("Right Shift Operation : "+ "5>>3 = "+(5>>3));
        System.out.println("Binary: = "+Integer.toBinaryString(5>>3));

        System.out.println();

    }
}
