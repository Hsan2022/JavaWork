package org.example.glab_303_3_1;
//The contains() method checks whether the specified string (sequence of characters) is present in the string or not.
public class ContainExample {
        public static void main(String[] args)
        //declaring a String var
        String str1 = "Learn Java";

        //declare a Boolean RT labeled result
        Boolean result;


        // check if str1 contains "Java" str param
        result = str1.contains("Java");
        System.out.println(result);  // true

        // check if str1 contains "Python"
        result = str1.contains("Python");
        System.out.println(result);  // false

        // check if str1 contains ""
        result = str1.contains("");

        System.out.println(result);  // true
    }
}
