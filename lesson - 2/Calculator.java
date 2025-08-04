package com.conditionals;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user till user does not press x or X
        int answer = 0;
        while(true){
            // take the operator as input
            System.out.println("Enter an operator : ");
            char op = sc.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                // Input two numbers
                System.out.print("Enter two numbers : ");

                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if(op == '+'){
                    answer = num1 + num2;
                }
                if(op == '-'){
                    answer = num1 - num2;
                }
                if(op == '*'){
                    answer = num1 * num2;
                }
                if(op == '/'){
                    if (num2 != 0){
                        answer = num1 / num2;
                    }
                }
                if(op == '%'){
                    answer = num1 % num2;
                }
            }else if(op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("Invalid operation");
            }
            System.out.println(answer);
        }


    }
}
