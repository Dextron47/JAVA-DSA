package com.scoping;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Sudhanshu";

        {
            // already initialized outside the block in the same method, hence you cannot initialize again
            a = 67; // reassign the original  reference variable to some other value
            int c = 79;
            name = "Ankit";
            System.out.println(name);
            System.out.println(a);
            // value initialized in the block, remains in the block
        }
        int c = 900;
        System.out.println(name);
        System.out.println(a);
//        System.out.println(c); // cannot access outside the block

        // scoping in for loop

        for(int i = 0; i < 4; i++){
            System.out.println(i);
            int num = 90;
            a = 10000;
        }
        System.out.println(a);

    }

    static void random(int marks){
        int num = 39;
        System.out.println(num);
    }
}
