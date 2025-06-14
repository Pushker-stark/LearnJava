package com.pushker.learnjava.datatypes;

public class ConditionalStatements {
    public static void main(String[] args) {

        boolean isa = true;
        boolean isb= false;
        //if else if else
        if(!isa){
            System.out.println("Beach Day");
        }else if(isa && isb){
            System.out.println("Normal Day");
        }else{
            System.out.println("Sun Day");
        }

        //For longer if elese condition this can be a cause of inefficiency we can optimiz it via switch case.

        //Switch case break default ,not using break will print default.
        int day =1;
        String dayName;
        switch (day){
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;

            case 4:
                dayName = "Thursday";
                break;
            default:
                dayName = "Noday";
        }

        System.out.println(dayName);

        //Ternary operator
        int x=1;
        boolean isEven= x%2==0;
        String s=(x%2==1)?"Odd":"Even";

        System.out.println(s+" "+ !isEven);


    }
}
