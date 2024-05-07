package org.example.PA_303_7_1;


//Task 2: Write a program that returns the middle element in an array.
// Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7

public class PA_303_7_1_2 {
    public static void main(String[] args) {

        int[] myArr = {13, 5, 7, 68, 2};
        if (myArr.length % 2 != 0) {
            System.out.println(myArr.length/2);
        } else {
            System.out.println(myArr[myArr.length / 2 -1]);
        }
    }
}
