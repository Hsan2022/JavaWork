package org.example.glab_303_3_1;
//The Java string trim() method removes the leading and trailing spaces.
// It checks the Unicode value of the space character (‘\u0020’) before and after the string.
// If it exists, then remove the spaces and return the omitted string.


//Trying to eliminate the spaces between two strings
public class StringTrimExample {
    public static void main(String args[]){
        //declared string with spaces
        String s1="  hello   ";



        System.out.println(s1+"how are you");        // without trim() = hello   how are you
        //using the trim method on string plus a made up string
        System.out.println(s1.trim()+"how are you"); // with trim() = hellohow are you
    }
}
