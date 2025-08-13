package com.shadowing;

public class Shadowing {

    static int a = 90; // this will be shadowed at line 9

    public static void main(String[] args) {
        System.out.println(a);  // 90
        int a; // the class variable at line 5 is shadowed by this
//        System.out.println(a); // scope will begin when value is initialized
        a = 40;

        System.out.println(a);  // 40
        fun();
    }

    static void fun(){
        System.out.println(a);
    }
}
