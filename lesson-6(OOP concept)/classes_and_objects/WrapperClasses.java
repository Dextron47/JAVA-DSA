package com.oop;

public class WrapperClasses {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
////
//        Integer num = 45;

        Integer a = 10;
        Integer b = 20;

        swap(a, b);
        System.out.println(a + " " + b);

//        final int BONUS = 100;
//        BONUS = 12;

        final A sudhanshu = new A("Sudhanshu Jha ");

        sudhanshu.name = "new name";

        A obj;
        for(int i = 0; i < 10000000; i++){
            obj = new A("Random name");
        }

    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }



}

class A{
    final int num = 30;

    String name;

    public A(String name) {
        System.out.println("Object is being created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}
