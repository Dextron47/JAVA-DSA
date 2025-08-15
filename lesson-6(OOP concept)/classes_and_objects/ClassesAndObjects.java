package com.oop;

public class ClassesAndObjects {
    public static void main(String[] args) {

        // store 5 roll numbers
//        int[] rollNo = new int[5];

//        store 5 names
//        String[] names = new String[5];

        // data of 5 students (roll no, name, marks)
        int[] rollNo = new int[5];
        String[] names = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        // just declaring
//        Student sudhanshu;
//        sudhanshu = new Student();

        Student sudhanshu = new Student(11, "Sudhanshu", 84.2f);
        Student ankit = new Student();

//        sudhanshu.rollNo = 11;
//        sudhanshu.name = "Sudhanshu";
//        sudhanshu.marks = 82.8f;

//        sudhanshu.changeName("Shoe lover");
//        sudhanshu.greeting();

//
//        System.out.println(sudhanshu.rollNo);
//        System.out.println(sudhanshu.name);
//        System.out.println(sudhanshu.marks);

//        System.out.println(ankit.rollNo);
//        System.out.println(ankit.name);
//        System.out.println(ankit.marks);

//        System.out.println(Arrays.toString(students));

//        Student random = new Student();
//        System.out.println(random.rollNo);

//        Student random2 = new Student();
//        System.out.println(random2.name);

        Student one = new Student();

        Student two = one;
        one.name= "Something something";

        System.out.println(two.name);



    }


}

// create a class
// for every single students
class Student{
    int rollNo;
    String name;
    float marks = 90f;

    // we need a way to add the value of the above properties object by object

    // we need one word to access every object

    void greeting(){
        System.out.println("Hello, " + this.name + "!");
    }

    void changeName(String newName){
        this.name = newName;
    }

    Student (Student other){
        this.name = other.name;
        this.rollNo = other.rollNo;
        this.marks = other.marks;
    }


    Student(){
        // this is how we call a constructor from another constructor
        // internally: new Student()
        this(13, "default constructor", 87.4f);
    }

    // Student arpit = new Student(17, "Arpit", 89.3f)
    // here, this will be replaced with arpit
    Student(int rollNo, String name, float marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

}


