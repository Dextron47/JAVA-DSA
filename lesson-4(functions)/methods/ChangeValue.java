package com.methods;

import java.util.Arrays;

public class ChangeValue {

    public static void main(String[] args) {

        // create an array

        int[] arr = {1,3,53,2,45};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0] = 90; // if you make a change to the object via this reference variable, same object will be changed
    }

}
