package com.methods;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;

//        a = a + b;
//        b = a - b;
//        a = a - b;

//        swap(a, b);
//        System.out.println(a + " " +b);

        String name = "Sudhanshu Jha";
//        changeName(name);
        System.out.println(name);
//        System.out.println(naam);

    }
//
//    static void changeName(String naam) {
//        naam = "Ankit";
//    }

    static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // this change be only be valid in this function scope only.
    }
}
