package org.example.PA_303_3_1;

//public class PA_303_3_1_Substring {
//    public static void main(String[] args) {
//        // Initializing String with constructor
//        String string1 = new String("Hello world");
//        System.out.print("The extracted substring is : ");

//        //The substring() method has two variants and
//        //returns a new string that is a substring of this string.
//
//        //finds string starting at 10 and returns it to the end of string
//        System.out.println(string1.substring(10));

// main function

// If the endIndex is equal to the length of the string, it returns an empty string.
// If the startIndex is greater than the endIndex, it throws an IndexOutOfBoundsException.
// Initializing String          01234567 89 10
//spaces count as index
//PRACTICE!!
//        String Str = new String("Welcome to PER SCHOLAS");
//
//        // using substring() to extract substring
//        // returns geeks
//        System.out.print("The extracted substring  is : ");
//        System.out.println(Str.substring(10, 16));

//            //new scanner class to create input stream from constructor
//            Given a string, , and two indices,  and , print a substring consisting of all characters in the inclusive range from  to . You'll find the String class' substring method helpful in completing this challenge.
//            Input Format
//            The first line contains a single string denoting .
//            The second line contains two space-separated integers denoting the respective values of  and .
//                    Const


import java.util.Scanner;

import static java.lang.System.in;

public class Substring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        int start = in.nextInt();
        int end = in.nextInt();


        System.out.println(S.substring(start, end));
    }
}

    //dont understand yet