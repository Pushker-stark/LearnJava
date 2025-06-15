package com.pushker.learnjava.oops;

public class AccessModifier {
    public static void main(String[] args) {
        Car car = new Car("Yellow");
        car.speed=22;
    }
    /*
    * private only smae class
    * default within class, package
    * protected within class, package,subclass
    * public anywhere
    * */
}
