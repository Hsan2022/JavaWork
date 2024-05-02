package org.example;

import java.util.Scanner;

//Scanner are used to capture input

public class ScannerExample {
    public static void main(String[] args) {
        //make new instance of scanner object
        Scanner scanner = new Scanner(System.in);
        //
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        //sc1. click dot for methods menu available

        System.out.println("The number is : " + number);
    }
}
