package org.example;

//one try, multiple catch

public class ownTryCatch3 {
    public static void main(String[] args) {
        int i, j, k = 0;
        i = 8; //normal statement
        j = 2; //normal statement

        //declare and initialize an array using new keyword
        //int return type, label, is an array =
            //int return type array of size [4]
                //creating a new array object,
                //"new" is allocating memory for an arr of integers
                //"a" is an int array, it can hold 4 integer values, default all elements ara val of 0
        int a[] = new int[4];

        try {
            //anything divided bt zero will throw an exception
            k = i / j; //critical statement - put in try catch

            //for loop to add value to each el
            //BUT it is going to throw an exception
            //bc loop is going to pos 4 and
            // "a" array = 4 values [4] = pos, 0, 1, 2, 3
            //need to add another catch block
            //removing = resolves issue
            for(int c = 0; c <= 4; c++) {
                //0+1 = 1, 1+1 + 2, etc
                a[c] = c+1;
            }
            //for each var "value" in "a" array
            //print value one by one in a new line
            // = 1, 2, 3 , 4
            for(int value : a) {
                System.out.println(value);
            }
        }
        //catch Main Class is Exception e
        catch (ArithmeticException e) {
//            System.out.println(e); //works!
//            System.out.println("Cannot divide by zero" + e.getMessage()); //method does not show up
            System.out.println("Cannot divide by zero" + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Maximum number of values is 4");
        }
        System.out.println(k);
    }
}


//code that actually passed
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//
//class Result {
//    public static void iterateAndDivide(int[] arr, int startAt, int endAt, int divideBy) {
//        try {
//            System.out.println("Dividing by " + divideBy + ":");
//            //
//            if (startAt < endAt) {
//                for (int i = startAt; i <= endAt; i++) {
//                    System.out.println("  Index " + i + ": " + (arr[i] / divideBy));
//                }
//            } else {
//                for (int i = startAt; i >= endAt; i--) {
//                    System.out.println("  Index " + i + ": " + (arr[i] / divideBy));
//                }
//            }
//        //}
//        // Add catch blocks to handle any exceptions that may occur.
////         catch (ArithmeticException e) {
//// //            System.out.println(e); //works!
////             System.out.println("Cannot divide by zero" + e);
////         }
////         catch (ArrayIndexOutOfBoundsException e) {
////             System.out.println("Maximum number of values is passed");
//        } catch (Exception e) {
//            System.out.println(e); //works!
//        }
//    }
//}
//
//public class Solution {
//    public static void main(String[] args) {
//        int[] arr = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
//
//        Result.iterateAndDivide(arr, 2, 4, 2);
//        Result.iterateAndDivide(arr, 2, 20, 1);
//        Result.iterateAndDivide(arr, 10, 2, 0);
//        Result.iterateAndDivide(arr, 10, -1, -2);
//    }
//}