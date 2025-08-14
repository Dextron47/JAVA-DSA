package com.oop.static_example.singleton;

public class Singleton {

    // you cant use private anywhere else
    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance(){
        // check whether 1 obj only is created or not

        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }



}
