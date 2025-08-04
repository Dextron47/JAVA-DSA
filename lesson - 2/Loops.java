package com.conditionals;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Loops
        // Q : Print number from 1 to 5

//        System.out.println("1");
//        System.out.println("2");
//        System.out.println("3");
//        System.out.println("4");
//        System.out.println("5");

        /* syntax of for loop

            for (initialization; condition; increment/decrement){
                // body
            }

         */

//        for(int num = 1; num <= 5; num++) {
//            System.out.println(num);
//        }

        // print number from 1 to n

//        int n = sc.nextInt();

//        for(int i = 1; i <= n; i++) {
//            System.out.print(i + " ");
//        }

//        for(int i = 1; i <= n; i++) {
//            System.out.println("Hello World");
//        }

        /*
            syntax for while loop:
            while(condition) {
                // body
                // increment / decrement
            }
         */
//
//        int num = 1;
//        while(num <= 5){
//            System.out.println(num);
//            num++;
//        }

        /*
            Do while loop
            syntax:
            do{
                // body
                // increment / decrement
            } while (condition);
         */

        int n = 1;
//        do {
//            System.out.println(n);
//            n++;
//        } while (n <= 5);

        do {
            System.out.println("Hello World");
        } while (n != 1);


    }
}
