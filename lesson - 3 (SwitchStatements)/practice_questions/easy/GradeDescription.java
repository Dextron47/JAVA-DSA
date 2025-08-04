package com.switch_statements;
import java.util.Scanner;

public class GradeDescription {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Grade Description
//
//        Input: Character (A, B, C, D, F)
//
//        Output: Grade description (e.g., A → Excellent)

        char input = sc.next().charAt(0);

//        int marks = sc.nextInt();



        switch(input){
            case 'A' :
                System.out.println("Excellent");
                break;
            case 'B' :
                System.out.println("Very Good");
                break;
            case 'C' :
                System.out.println("Good");
                break;
            case 'D' :
                System.out.println("Average");
                break;
            case 'E' :
                System.out.println("Fail");
                break;
            default :
                System.out.println("Unknown");
                break;

        }

    }
}
