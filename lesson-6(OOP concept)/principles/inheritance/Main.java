package com.oop.principles.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4.6, 4.9, 3.5);
//        Box box2 = new Box(box1);

//        System.out.println(box1.length + " " + box1.width + " " + box1.height);

//        BoxWeight box3 = new BoxWeight();
//        System.out.println(box3.length + " " + box3.weight);
//        BoxWeight box4 = new BoxWeight(2, 3, 5 ,5);

//        Box box5 = new BoxWeight(2,3,4,5);
//        System.out.println(box5);

        // there are many variables in both parent and child class
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialized
        // but here, when the obj itself is of type parent class, how will you call the constructor
        // that is why error
//        BoxWeight box6 = new Box(1, 2,3);
//        System.out.println(box6);

//
//        BoxPrice price = new BoxPrice(5, 8,200);
//        System.out.println(price.cost);


//        Box.greeting();

        BoxWeight box = new BoxWeight();
        BoxWeight.greeting();  // you can inherit but cannot override

    }
}

