package org.example.glab_303_3_1;
//The length() method returns the number of characters present in the string.
public class lengthDemo {
    public static void main(String[] args) {
        //declare new string var = Java
        String str1 = "Java";
        //declare empty string var
        String str2 = "";


        //printing arrays length method
        System.out.println(str1.length());  // 4
        System.out.println(str2.length());  // 0

        //printing arrays length method
        System.out.println("Java".length());  // 4


        // new line is considered a single character
        System.out.println("Java\n".length()); // 5

        /*
        printing a new string within console
        space between words count as length too
        */
        System.out.println("Learn Java".length()); // 10
    }

}
