package com.pushker.learnjava.oops;

import java.sql.SQLOutput;

public class Class {
    public static void main(String[] args) {
        //fields and methods -> variables and functions
        //Objects instance of class
        Car car = new Car("Green");
//        car.speed = 110;
//        car.color = "Green";
//        car.drive();
        
//        car.color="Red";

        //Encapsulation - hiding exact variable using getter and setter
        car.setSpeed(12);

        //Inheritance - Allows class to aquire properties and methods of another class

//        SmartPhone smartPhone = new SmartPhone();
//        smartPhone.capture();
//        smartPhone.turnOn();//It will not work because which inheritance method it will pick that's why multiple inheritance is not supported in java and the solution is interface.

    }

    //Multi level Inheritance
    class Child extends Parent{

    }

    class Parent extends GrandParent{

    }
    class GrandParent{

    }
};

//Java does not support multiple Inheritance
class Camera{
    void capture(){
        System.out.println("Photo clicking");
    }
    void turnOn(){
        System.out.println("turning on...");
    }
};
class MusicPlayer{
    void playMusic(){
        System.out.println("Music Playing...");
    }
    void turnOn(){
        System.out.println("turning on...");
    }
};
class Phone{
    void call(String number){
        System.out.println("Calling.."+number);
    }
    void turnOn(){
        System.out.println("turning on...");
    }
};

//class SmartPhone extends Camera,MusicPlayer,Phone{
//
//};
