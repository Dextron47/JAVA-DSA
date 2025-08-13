package com.var_args;

import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
//        fun(2, 3, 4, 6, 12, 3);
//        multiple(1,3, "Sudhanshu", "Ankit");

//        demo(12, 32, 321, 5);
//        demo();


    }

    static void multiple(int a, int b, String ...v){

    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

}
