package com.pushker.learnjava.oops;

class Printer{//Different Types of parameters
    void print(String s){
        System.out.println("String: "+s);
    }

    void print(int num){
        System.out.println("Integer: "+ num);
    }
    void print(double d){
        System.out.println("Double: "+ d);
    }
};

class Display{
    void show(String s,int num){
        System.out.println("String: "+s+", Number: "+num);
    }
    void show(int num,String s){
        System.out.println("Number: "+num+", String: "+s);
    }
};

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Hello ,World!");
        printer.print(100);
        printer.print(3.14);

        Display display = new Display();
        display.show("Java",101);
        display.show(202,"OOPS");
    }

}
