package org.example.PA_303_7_1;

////Task 8: Write a program that creates a String array of 5 elements
// and swaps the first element with the middle element without creating a new array.





public class PA_303_7_1_8 {
    public static void main(String[] args) {
        // Create a String array of 5 elements
        String[] array = {"white", "purple", "red", "green", "blue"};

        // Swap the first element with the middle element without creating a new array
        int middleIndex = array.length / 2;
        String temp = array[0];
        array[0] = array[middleIndex];
        array[middleIndex] = temp;

        // Print the array to verify the swap
        System.out.println("Array after swapping:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}
