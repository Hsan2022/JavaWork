package org.example.glab_303_6_1;

import java.util.Arrays;

public class ArrayDemoOne {
    public static void main(String[] args) {
        // declare an array, age with int values
        int[] age = {12, 4, 5, 2, 5};
        //simply print by accessing their position in the array
        System.out.println("Accessing Elements of an Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);
        //cannot just print the age var, must first wrap:
        //using arrays toString method passing in age argument to print int age as an array of interger values
        System.out.println(Arrays.toString(age));
    }
}
