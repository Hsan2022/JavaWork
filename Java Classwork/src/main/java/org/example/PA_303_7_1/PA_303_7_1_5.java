package org.example.PA_303_7_1;
//Task 5: Write a program where you create an integer array with a length of 5.
// Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.

public class PA_303_7_1_5 {
    public static void main(String[] args) {
        // declare an integer array with a length of 5
        int[] intArray = new int[5];

        // Loop through the array and assign the value of the loop control variable to the corresponding index
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }

        System.out.println("intArray:");
        for (int num : intArray) {
            System.out.println(num);
        }
    }
}