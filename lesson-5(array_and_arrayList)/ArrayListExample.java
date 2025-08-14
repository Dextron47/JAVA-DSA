package com.arrays_and_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // syntax
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
//
//        list.set(0,99);
//
//        System.out.println(list.contains(99));
//
//        System.out.println(list.get(1));
//
//        System.out.println(list);

//        // for input
//        for(int i = 0; i < 5; i++){
//            list.add(sc.nextInt());
//        }
//
//        // for output
//        for(int i = 0; i < 5; i++){
//            System.out.println(list.get(i));  // pass index here, list[index] syntax will not work here
//        }

        System.out.println(list.size());

    }
}
