package com.pushker.learnjava.oops;

public class Car {
    public  int speed;
    private String color;
    public Car(String color){
        this.color=color;
    }
    public void setSpeed(int speed){
        if(speed<0){
            System.out.println("Not Possible!");
        }else{
            this.speed = speed;
        }

    }
}
