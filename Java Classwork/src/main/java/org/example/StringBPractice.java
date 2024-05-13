package org.example;

//new StringBuffer() → Creates an empty String buffer with the initial capacity of 16.

//new StringBuffer​(int capacity) → Creates an empty String buffer with the specified capacity as length.
//StringBuffer​(100) → Room for 100 characters.
//
//new StringBuffer​(String str) → Creates a String buffer with the specified string.
//New StringBuffer(“Per Scholas”) → Room for given string and 16 additional characters.


public class StringBPractice {
    public static void main(String[] args) {
        //StringBuffer class that provides methods to manipulate strings
        //create a StringBuffer str variable initialized to a string "Java Full Stack Developer"
        //Another way of writing it:
        //StringBuffer str = new StringBuffer(str: "Java Full Stack Developer");
        StringBuffer str = new StringBuffer("Crystal");

        //declare int len return type var is set to the result of the str var length
        int len = str.length();
        //print the len var value
        System.out.println("Length : " + len); //25

        //declare int return type var cap is set to the result of the str var capacity
        //The 3rd type of StringBuffer Constructor build - Has room/capacity for given string ANd 16 additional characters
        int cap = str.capacity(); //41

        //print the len var value
        System.out.println("Capacity : " + cap);
// ----- append()--------------------
        //add a string to the end of the string
        str.append("is a Software Eng "); // appends a string in the previously defined string.
       //print the now modified str variable
        System.out.println(str);

        //add a string to the end of the string
        str.append("Java is my favourite language ");

        //add a string to the end of the string
        str.append("but i love python");

        //print the now modified str variable
        System.out.println(str);
// ----------- reverse()----------------------
        //StringBuffer class new StringBuffer
        StringBuffer stringName = new StringBuffer("Welcome to Per Scholas");

        //print "statement: " PLUS variable StringName
        System.out.println("Original String: " + stringName);


        //CALLING/INVOKING label variable's reverse method of chars in StringBuffer
        stringName.reverse();
        //print "statement: " PLUS variable StringName
        System.out.println("Reversed String: " + stringName);
    }
}
