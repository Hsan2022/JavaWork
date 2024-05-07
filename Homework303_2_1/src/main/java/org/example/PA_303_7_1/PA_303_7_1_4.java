package org.example.PA_303_7_1;
//Task 4: Write a program that creates an integer array with 5 elements (i.e., numbers).
// The numbers can be any integers.
// Print out the value at the first index and the last index using length - 1 as the index.
// Now try printing the value at index = length (e.g., myArray[myArray.length] ).
// Notice the type of exception which is produced. Now try to assign a value to the array index 5.
// You should get the same type of exception.
public class PA_303_7_1_4 {
    public static void main(String[] args) {
        //initialize new array with length of 5
        int[] myArray = {2, 4, 6, 8, 10};
        System.out.println(myArray[0]); //2
        System.out.println("length : " + myArray[myArray.length-1]); //10
        System.out.println(myArray[myArray.length]);
        myArray[5] = 12;
    }
}