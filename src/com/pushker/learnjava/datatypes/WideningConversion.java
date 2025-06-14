package com.pushker.learnjava.datatypes;

public class WideningConversion {
    public static void main(String[] args) {
//        System.out.println("Widening conversion Example:");//automatic implicit conversion

//        byte byteValue = 10;
//        short shortVal = byteValue;
//        int intVal = shortVal;
//        long longVal = intVal;
//        float floatVal = longVal;
//        double doubleVal = floatVal;
//        System.out.println("byte: "+byteValue);
//
//        System.out.println("int: "+intVal);
//        System.out.println("long: "+longVal);
//        System.out.println("short: "+shortVal);
//        System.out.println("float: "+floatVal);
//        System.out.println("double: "+doubleVal);

        System.out.println("Narrowing conversion Example:");//automatic explicit conversion

        double doubleVal = 123.456;
        float floatVal = (float)doubleVal;
        long longVal = (long) floatVal;
        int intVal = (int) longVal;
        short shortVal = (short) intVal;
        byte byteValue = (byte) shortVal;

        System.out.println("byte: "+byteValue);

        System.out.println("int: "+intVal);
        System.out.println("long: "+longVal);
        System.out.println("short: "+shortVal);
        System.out.println("float: "+floatVal);
        System.out.println("double: "+doubleVal);

    }


}
