package com.pushker.learnjava.collections;
import java.util.*;

//Integer - is wrapper of int
public class CF {
    public static void main(String[] args) {
        //List ->>ArrayList, LinkedList
        //Set ---> HAshSEt, LiskedHashSet
        //Map --> HAshMAp,LinkedHAshMAp

//        List is interface parent class of ArrayList
        List<Integer> arrayList = new ArrayList();// 10 size array created after filled 1.5 of prev size array created and all old elemnts trasfered to new array internally.
         ArrayList<Integer> arrayList2 = new ArrayList();
        arrayList.add(1);
        arrayList.add(11);
        arrayList.add(111);

        arrayList2.addAll(arrayList);
        System.out.println(arrayList.contains(11));
        System.out.println(arrayList2);

        List<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //list- it having the pointers so to insert in between never cause shifting of all elemnts in array.
        Set<Integer> set = new HashSet<>();


    }
}
