package com.pushker.learnjava.datastructures;

public class ArrayDs {
    public static void main(String[] args) {
        System.out.println("Arrays");

        //store same typed fixed size sequqence of element.

        //Declaration
        int[] arr = new int[5];//object create inside heap
        arr[4]=45;

        System.out.println(arr[4]);
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }



    }
}
