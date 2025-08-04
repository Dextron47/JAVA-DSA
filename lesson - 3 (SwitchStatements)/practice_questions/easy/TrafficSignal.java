package com.switch_statements;

import java.util.Scanner;

public class TrafficSignal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Traffic Signal
//
//        Input: Color (red, yellow, green)
//
//        Output: Action (Stop, Ready, Go)

        String str = sc.nextLine();

        switch(str){
            case "red" :
                System.out.println("Stop");
                break;
            case "blue" :
                System.out.println("Ready");
                break;
            case "green" :
                System.out.println("Go");
                break;
            default :
                System.out.println("Invalid input");
                break;
        }

    }
}
