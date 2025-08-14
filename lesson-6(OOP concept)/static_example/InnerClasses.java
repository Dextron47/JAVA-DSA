package com.oop.static_example;


public class InnerClasses {

    static class Test{
        String name;

        public Test(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }

    }


    public static void main(String[] args) {
        Test a = new Test("sudhanshu");
        Test b = new Test("arpit");

        System.out.println(a);

//        System.out.println(a.name);
//        System.out.println(b.name);
    }

}

