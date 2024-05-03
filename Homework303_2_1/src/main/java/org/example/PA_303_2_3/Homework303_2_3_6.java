package org.example.PA_303_2_3;

public class Homework303_2_3_6 {
    public static void main(String[] args) {
        //Write a program that demonstrates at least three ways to increment a variable by 1 and does this multiple times.
        //Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print it again.
        int val1 = 20;
        val1 += 1;
        System.out.println(val1); //23
        System.out.println(val1); //20
        System.out.println(++val1); //21
        System.out.println(val1++); //21
    }
}
