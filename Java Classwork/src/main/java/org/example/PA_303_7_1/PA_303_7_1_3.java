package org.example.PA_303_7_1;

import java.util.Arrays;


public class PA_303_7_1_3 {
    //Task 3: Write a program that creates an array of String type and initializes it with the strings “red,” “green,” “blue,” and “yellow.”
    // Print out the array length.
    // Make a copy using the clone( ) method.
    // Use the Arrays.toString( ) method on the new array to verify that the original array was copied.


    public static void main(String[] args) {
        // creates an array of String type and initializes it
        String[] colorsArray = {"red", "green", "blue", "yellow"};

        // Print out the array length
        System.out.println("Array length: " + colorsArray.length);
        //create a string array
        //initialize it to the evaluated result of invoking the clone method on arr
        // Make a copy using the clone() method
        String[] newArray = colorsArray.clone();

        // Use Arrays.toString() to print the copied array
        System.out.println("The new array: " + Arrays.toString(newArray));
    }
}
