package com.pushker.learnjava.controlflow;

public class Loops {
    public static void main(String[] args) {

        //while loop
//        int i=0;
//
//        while(i<=10)
//        {
//            System.out.println(i);
//            i++;
//        }
        // variable are declared outside of while loop

        //for loop
//        for(int j=0;j<=10;j++)
//        {
//            System.out.println(j);
//        }

        //Do While loop is used when after completing loop still we want to print after the loop end

//        int k=0;
//
//        do{
//            k++;
//            System.out.println(k);//101
//        }while(k<=100);


        //Enhanced for-each loop
        int[] num={1,2,3,4,5,6,7,8,9,10};
        for(int x:num)
        {
            System.out.println(x);
        }

    }
}
