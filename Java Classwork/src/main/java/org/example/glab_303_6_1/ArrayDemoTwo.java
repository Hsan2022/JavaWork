package org.example.glab_303_6_1;

public class ArrayDemoTwo {
    public static void main(String[] args) {

        // declare an array, age and assign it an array of int values
        int[] age = {12, 4, 5};

        // loop through the array to print each val using the print() passing in age[i]
        System.out.println("Using for Loop:");
        for(int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
    }
}
