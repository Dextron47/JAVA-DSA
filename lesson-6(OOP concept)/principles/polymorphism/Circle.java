package com.oop.principles.polymorphism;

public class Circle extends Shapes {

    @Override
    void area(){
        System.out.println("Area : pie * r * r");
    }

}
