package com.sudhanshu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)

    {
        System.out.println("Hello, World!");

        System.out.println("my name is " + System.getProperty("user.name"));

        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt());
        System.out.println(sc.next());
    }

}