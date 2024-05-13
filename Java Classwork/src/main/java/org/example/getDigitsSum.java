package org.example;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'getDigitsSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER largeNumber as parameter.
     */

    //add func that takes an int as arg
    public static int getDigitsSum(int largeNumber) {


    //making int to string to be able to iterate by
    //calling the valueOf method of String class with 'largeNumber' passed in
    //and storing its result in the 'number' variable
    String number = String.valueOf(largeNumber);


        //declare initial result val to 0
        int sum = 0;


        //iterate through the int noe str
        for(int pos = 0; pos < number.length(); pos++) {


            //adding char (returned as int) at current position to sum
            //Char is a wrapper class that has access to a get numeric value method
            //this method takes in a string var which has access to another method 'get a char

            sum += Character.getNumericValue(number.charAt(pos));
        }


        //return sum of its integers via the 'sum' variable
        return sum;


    }
}
