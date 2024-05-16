package org.example.glab_303_11_5;

import java.util.HashSet;

public class TreesetExampleone {
    public static void main(String[] args) {
        HashSet<Integer> evenNumber = new HashSet<>();
        // Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber);

        HashSet<Integer> numbers = new HashSet<>();
        // Using addAll() method
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New HashSet: " + numbers);
    }
}
