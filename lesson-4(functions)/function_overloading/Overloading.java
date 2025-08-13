package com.function_overloading;

public class Overloading {
    public static void main(String[] args) {
//        fun(12);
//        fun("Sudhanshu Jha");
        int ans = sum(3, 4, 7);
        System.out.println(ans);
    }

    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);
    }

    static int sum(int a, int b){
        return a + b;
    }

    static int sum(int a, int b, int c){
        return a + b + c;
    }

    static void fun(String name){
        System.out.println("second one");
        System.out.println(name);
    }
}
