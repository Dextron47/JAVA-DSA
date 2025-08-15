package com.oop.principles.inheritance;

public class Box {

    double length;
    double width;
    double height;

    static void greeting(){
        System.out.println("Hello, I am in Box class. Greetings");
    }

    Box(){
        this.height= -1;
        this.width= -1;
        this.length= -1;
    }

    // cube
    Box(double side){
        super();

        this.length= side;
        this.width= side;
        this.height= side;
    }

    public Box(double length, double width, double height) {
        System.out.println("print box class constructor");
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(Box old){
        this.length= old.length;
        this.width= old.width;
        this.height= old.height;
    }

    public void information(){
        System.out.println("Running the box");
    }

}
