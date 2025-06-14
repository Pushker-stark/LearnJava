package com.pushker.learnjava.datatypes;

public class AirthmeticOperator {
    public static void main(String[] args) {
        System.out.println("Airthematic operators");

        int a = 5+3;
        int b=10-4;
        int c = 6*7;
        float d = 10/3.0f;
        double e = 10/3.0;
        int f=10%3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        a +=5;
        System.out.println(a);

        a -= 3;
        System.out.println(a);
        a*=2;
        System.out.println(a);
        a/=4;
        System.out.println(a);
        a%=4;
        System.out.println(a);

        a++;//post increment
        a--;
        ++a;
        --a;//post decrement


    }
}
