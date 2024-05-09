package org.example.PA_303_7_1;


//Task 9:
//Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
// Print the array in ascending order, and print the smallest and the largest element of the array. The output will look like the following:
//Array in ascending order: 0, 1, 2, 4, 9, 13
//The smallest number is 0
//The biggest number is 13

import java.util.Arrays;

public class PA_303_7_1_9 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 13, 1, 0};

        //sort array
        //use Array class sort method passing in arr var as argument
        Arrays.sort(arr);

        //print arr in ascending order
        System.out.println(Arrays.toString(arr));

    }
}
