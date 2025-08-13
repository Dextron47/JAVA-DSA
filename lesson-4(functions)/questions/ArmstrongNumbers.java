package com.questions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArmstrongNumbers {

    public static void main(String[] args) {
        // print all the 3 digits armstrong number

        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        System.out.println(isArmstrong(n));

        for(int i = 100; i < 1000; i++){
            if(isArmstrong(i)){
                System.out.println(i + "");
            }
        }
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }

//        if (sum == original) {
//            return true;
//        }
//        return false;
//
        return sum == original;
    }

}
