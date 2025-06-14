package com.pushker.learnjava.oops;

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

        //Inheritance - Allows class to aquire properties and methods





    }

    //Multi level Inheritance
    class Child extends Parent{

    }

    class Parent extends GrandParent{

    }
    class GrandParent{

    }
}
