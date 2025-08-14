package com.oop.static_example;

public class Main {
    public static void main(String[] args) {
        Human sudhanshu = new Human("Sudhanshu", 22, 45000, false);

        Human rahul = new Human("rahul", 30, 145000, true);
        Human arpit = new Human("arpit", 30, 145000, false);


        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);

        Main funn = new Main();
        funn.fun2();

    }

    // this is not dependent on objects
    static void fun(){
//
//        greeting();  // you cant use this because it requires an instance
//        // but the function you are using it in does not depend on instances


        // you cannot access non-static stuff without referencing their instances in a static context
        // hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();


    }

    void fun2(){
        greeting();
    }

    // we know that something which is not static, belongs to an object
    void greeting(){
        fun();
        System.out.println("Hello World");
    }
}
