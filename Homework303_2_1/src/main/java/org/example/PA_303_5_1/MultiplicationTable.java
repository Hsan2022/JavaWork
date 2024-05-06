package org.example.PA_303_5_1;

public class MultiplicationTable {
    public static void main(String[] args) {
        //Print a multiplication table
        System.out.printf("%16sMultiplication Table%n", " ");
        int size = 11;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
