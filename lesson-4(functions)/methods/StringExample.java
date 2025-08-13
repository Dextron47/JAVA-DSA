package com.methods;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String msg = greet();
//        System.out.println(msg);


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String naam = scanner.next();

        String pesonalised = myGreet(naam);
        System.out.println(pesonalised);
    }

    static String myGreet(String name) {
        String msg = "Hello " + name;
        return msg;
    }

    static String greet(){

        String greeting = "How are you?";
        return greeting;
    }
}
