package com.pushker.learnjava.multithreading;

public class NumberCounter extends Thread {

    @Override
    public void run() {
        int count=0;
        for(int i=1;i<=5000000;i++)
        {
            if(i%10==7){
                count++;
            }
        }
        System.out.println("Count of numbers ending in 7:" + count);
    }
}
