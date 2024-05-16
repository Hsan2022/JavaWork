package org.example.glab_303_11_5;

import java.util.HashSet;
import java.util.TreeSet;

public class TreesetExamplethreeIter {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using the first() method
        int first = numbers.first();
        System.out.println("First Number: " + first);

        // Using the last() method
        int last = numbers.last();
        System.out.println("Last Number: " + last);
    }

    public static class examplefour {
        public static void main(String args[]) {
            // HashSet declaration
            HashSet<String> hset = new HashSet<String>();

            // Adding elements to the HashSet
            hset.add("Apple");
            hset.add("Mango");
            hset.add("Grapes");
            hset.add("Orange");
            hset.add("Fig");
            //Addition of duplicate elements
            hset.add("Apple");
            hset.add("Mango");
            //Addition of null values
            hset.add(null);
            hset.add(null);
    // Using advanced for loop
            for (String str : hset) {
                System.out.println(" ---> " + str);
            }
        }

    }
}
