package com.arrays_and_arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];
//        arr[0] = 19;
//        arr[1] = 23;
//        arr[2] = 33;
//        arr[3] = 44;
//        arr[4] = 55;

        // [19, 23, 33, 44, 55]

//        System.out.println(arr[3]);

        // input using for loop
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));

//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

//        for(int num : arr){ // for every element in array, print the element
//            System.out.println(num + " "); // here num represents element of the array
//        }

        // array of objects

        String[] str = new String[4];

        for(int i = 0; i < str.length; i++){
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "Sudhanshu";
        System.out.println(Arrays.toString(str));

    }
}
