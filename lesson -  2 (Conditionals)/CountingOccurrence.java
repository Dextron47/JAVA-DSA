package com.conditionals;
import java.util.Scanner;

public class CountingOccurrence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Count the number of occurrences
        // n = 1 2 3 5 6 4 3 3 5  Answer : 3 = 3 occurrence

        int n = sc.nextInt();

        int count = 0;

        while (n > 0){
            int rem = n % 10;
            if(rem == 3){
                count++;
            }
            n /= 10;
        }

        System.out.println(count);


    }
}
