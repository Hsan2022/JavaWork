package org.example.PA_303_7_1;

//Task 7: Write a program where you create an array of 5 elements.
// Loop through the array and print the value of each element, except for the middle (index 2) element.

public class PA_303_7_1_7 {
    public static void main(String[] args) {
        // declare an integer array with a length of 5
        int[] intArray = new int[5];

        System.out.println(intArray);


        for (int i = 0; i < intArray.length; i++) {
            //Loop through the array and print the value of each element,
            // except for the middle (index 2) element.
            if (i != 2){
                System.out.println("Val: " + i + "val: " + intArray[i]);
            }
        }
    }
}

