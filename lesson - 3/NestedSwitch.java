package com.switch_statements;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int empId = sc.nextInt();

        String department = sc.next();

        switch (empId) {
            case 1 -> System.out.println("Sudhanshu Jha");
            case 2 -> System.out.println("Kunal Kushwaha");
            case 3 -> {
                System.out.println("Employee 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("Department not found");
                }
            }
            default -> System.out.println("Enter a valid employee ID");
        }

        switch(empId){
            case 1 :
                System.out.println("Sudhanshu Jha");
                break;
            case 2 :
                System.out.println("Kunal Kushwaha");
                break;
            case 3 :
                System.out.println("Employee 3");
                switch (department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("Department not found");
                }
                break;
            default:
                System.out.println("Enter a valid employee ID");
        }
    }
}
