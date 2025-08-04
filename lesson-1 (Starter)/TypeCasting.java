package com.sudhanshu;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        float num = sc.nextFloat();
//        System.out.println(num);

        // type casting
//        int num = (int)(67.34453f);
//        System.out.println(num);

        // automatic type promotion in expressions

//        int a = 1025;
//        byte b = (byte)(a); // 257 % 256 = 1

//        System.out.println(b);
//
//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;
//
//        System.out.println(d);


//        byte b = 50;
//        b = b * 2;

//        int number = 'b';
//        System.out.println(number);

//        System.out.println("नमस्ते");
//        System.out.println("你好");

//        System.out.println(3 * 2.3);

        byte b = 42;
        char c = 'd';
        short s = 1024;
        int i = 343;
        float f = 2023.2020f;
        double d = 3.14159265358979323846;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c)  + " " +  (d * s));
        System.out.println(result);

    }
}
