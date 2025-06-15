package com.pushker.learnjava.oops;

//Focus on hiding implementation
//Achieved through abstract classes and Interfaces

//If multiple line we have to write for method overriding its better to have a abstract class which having abstract method and we can define extend accordingly no need to pre write th actual logig just make skeleton of it.

//Abstraction + ovveriding extend
abstract class Animals{
    String color;
    boolean hasSuperPowers;
 abstract void sayHello();
 abstract void sayBye();
 void sleep(){
     System.out.println("zzz...");
 }
}

class Dogs extends Animals{
    @Override
    void sayHello() {
        System.out.println("Woof");
    }
    @Override
    void sayBye() {
        System.out.println("Woof,Woof..");
    }
}

//Interface is blueprint of class
interface Mobiles{
//    static final
    int numOfBatteries=1;//can used by classes
    void makeCall();
}
interface MusicPlayer2{
    void playMusic();
}
class SmartPhones implements Mobiles,MusicPlayer2{
    @Override
    public void makeCall() {
        System.out.println("Making Call...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing the music from Interface");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Dogs dog = new Dogs();
        dog.sayBye();
        dog.sleep();
    }
}
