package com.oop.static_example;

public class Human {
    int age;
    String name;
    int salary;
    boolean isMarried;
    static long population;

    static void message(){
        System.out.println("hello world");
//        System.out.println(this.age);  // this cannot use over here
    }

    public Human(String name, int age, int salary, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;

        Human.population += 1;

    }

}
