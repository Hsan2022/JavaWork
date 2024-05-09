package org.example.PA_303_7_1;



//Task 10: Create an array that includes an integer, 3 strings, and 1 double. Print the array.
//Task 11: Write some Java code that asks the user how many favorite things they have. Based on their answer, you should create a String array of the correct size. Then ask the user to enter the things and store them in the array you created. Finally, print out the contents of the array.
//
//
//Example
//How many favorite things do you have?
//7
//
//Enter your thing: phone
//Enter your thing: tv
//Enter your thing: xbox
//Enter your thing: wine
//Enter your thing: beer
//Enter your thing: sofa
//Enter your thing: book
//Your favorite  things are:
//phone tv xbox wine beer sofa book



//Task 1: Write a program that creates an array of integers with a length of 3.
// Assign the values 1, 2, and 3 to the indexes.
// Print out each array element.

public class PA_303_7_1_1 {
    public static void main(String[] args) {
        int[] array = new int [3];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
