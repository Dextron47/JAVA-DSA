package com.methods;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Q. Take inputs of 2 number and print the sum

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1 : ");
        int number1 = sc.nextInt();

        System.out.println("Enter number 2 : ");
        int number2 = sc.nextInt();

        int sum = number1 + number2;
        System.out.println("The sum is : "+sum);


    }



}
