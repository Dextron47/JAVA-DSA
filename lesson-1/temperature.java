package com.sudhanshu;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature in celcius : ");
        double temperature = sc.nextDouble();

        double result = (temperature * 9 / 5) + 32;
        System.out.println(result);
    }
}
