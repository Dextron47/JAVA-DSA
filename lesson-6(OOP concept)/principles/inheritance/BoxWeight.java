package com.oop.principles.inheritance;

public class BoxWeight extends Box {

    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double length, double width, double height, double weight) {

        super(length, width, height);  // call the parent class constructor
        // used to initialize values present in parent class
        this.weight = weight;





//
//        System.out.println(super.width);
    }
}
