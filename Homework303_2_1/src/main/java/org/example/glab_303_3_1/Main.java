package org.example.glab_303_3_1;
//The split() method divides the string at the specified regex and returns an array of substrings. The syntax of the string split() method is:
//string.split(String regex, int limit)
//regex - the string is divided at this regex (can be strings)
//limit (optional) - controls the number of resulting substrings
//
//If the limit parameter is not passed, split() returns all possible substrings.

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String vowels = "a::b::c::d:e";

        // splitting the string at "::"
        // storing the result in an array of strings
        String[] result = vowels.split("::");

        // converting array to string and printing it
        System.out.println("result = " + Arrays.toString(result)); // //result = [a, b, c, d:e]
    }
}


//Here, we split the string at ::  S
// Since the limit parameter is not passed, the returned array contains all the substrings.