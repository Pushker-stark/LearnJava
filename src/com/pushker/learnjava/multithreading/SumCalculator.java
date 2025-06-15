package com.pushker.learnjava.multithreading;

public class SumCalculator implements Runnable{

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        long sum = 0;
        for(int i=0;i<=10000000;i++){
            sum+=1;
        }
        System.out.println("Sum: "+sum);
    }
}
