package com.pushker.learnjava.multithreading;

public class MyThread extends Thread{
    private Counter counter;

    public MyThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++) {
            counter.increment();
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter.getCount());
    }
}

class Counter{
    private int count =0;//Shared Resource
    public synchronized void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }
}
