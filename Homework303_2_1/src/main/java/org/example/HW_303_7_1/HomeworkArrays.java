package org.example.HW_303_7_1;

import java.util.Arrays;
import java.util.Random;

//2) Initialize the array to random integers
//
//3) I want you to get the smallest integer in the array
//
//4) I want you to get the largest integer in the array
//
//5) I want you to calculate the average value in the array as a double.  Average is the sum of all elements in the array divided by the length of the array
//
//You can only use a single for loop



import java.util.*;
//using a hava java steam to create a rand arr
public class HomeworkArrays {
    public static void main(String[] args) {

        //1-2
        //this is a Random class with random label
        //initialized to the evaluated result of invoking the random method
        Random random = new Random();
        //declaring array to the evaluated result of the java ints method of random class
        //stream into array
        int[] arr = random.ints(10).toArray();
        // print array of integers
        System.out.println(Arrays.toString(arr));

        //3-4
        //sort array for smallest and largest
        Arrays.sort(arr);
        //var w/smallest value by ref its index in the arr
        int smallestArr = arr[0];
        System.out.println("The smallest integer is: " + smallestArr);
        //var w/largest value by ref its index in the arr
        int largestArr = arr[arr.length - 1];
        System.out.println("The largest integer is: " + largestArr);

        //5
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / arr.length;
        System.out.println("The average of the array is: " + average);
    }
}

