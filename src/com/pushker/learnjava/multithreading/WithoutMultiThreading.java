package com.pushker.learnjava.multithreading;

public class WithoutMultiThreading {
    public static void main(String[] args) {
        System.out.println("Lets learn multithreading..");
        System.out.println(Thread.currentThread());

        long startTime = System.currentTimeMillis();
        long sum = 0;
        for(int i=0;i<=10000000;i++){
            sum+=1;
        }
        System.out.println("Sum: "+sum);

        int count=0;
        for(int i=1;i<=5000000;i++)
        {
            if(i%10==7){
                count++;
            }
        }
        System.out.println("Count of numbers ending in 7:" + count);
        System.out.println("Time Taken: "+(System.currentTimeMillis()-startTime) + " ms");


    }
}
