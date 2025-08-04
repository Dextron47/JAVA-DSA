package com.switch_statements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Simple Calculator
//
//        Input: Two numbers and an operator (+, -, *, /)
//
//        Output: Result of the operation

        char operation = sc.next().charAt(0);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        switch(operation){
            case '+' :
                System.out.println(num1 + num2);
                break;
            case '-' :
                System.out.println(num1 - num2);
                break;
            case '*' :
                System.out.println(num1 * num2);
                break;
            case '/' :
                System.out.println(num1 / num2);
                break;
            case '%' :
                System.out.println(num1 % num2);
                break;
            default :
                System.out.println("Invalid operation");
                break;
        }

    }
}
