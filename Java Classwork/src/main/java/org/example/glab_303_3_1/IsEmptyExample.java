package org.example.glab_303_3_1;
/*
IsEmpty() method:
//returns  boolean
This method checks whether the String contains anything or not.
If the Java String is empty, it returns true or false.
*/
public class IsEmptyExample {
    public static void main(String args[]){

        //declaring String DT var to 0
        String s1="";

        //declaring String DT var to "hello"
        String s2="hello";


        //boolean/question
        System.out.println(s1.isEmpty());      // true
        //boolean
        System.out.println(s2.isEmpty());      // false
    }
}
