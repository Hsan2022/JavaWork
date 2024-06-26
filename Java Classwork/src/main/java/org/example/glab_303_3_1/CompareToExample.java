package org.example.glab_303_3_1;
//The Java String compareTo() method compares the given string with the current string.
// It is a method of ‘Comparable’ interface that is implemented by the String class.
// It either returns a positive number, a negative number, or 0.
public class CompareToExample {
    public static void main(String args[]){

        //declaring a string with RT, var name, vaolue
        String s1="hello";
        String s2="hello";
        String s3="hemlo";
        String s4="flag";

        //number value depends on the number of times greater/less than
        System.out.println(s1.compareTo(s2)); // 0 because both are equal
        System.out.println(s1.compareTo(s3)); //-1 because "l" is only one time lower than "m"
        System.out.println(s1.compareTo(s4)); // 2 because "h" is 2 times greater than "f"
    }
}
