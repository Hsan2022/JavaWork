package org.example;

import java.util.Scanner;

//Scanner are used to capture input, a read operation, but not to read files. We'll do that with other iots

public class ScannerExample {
    public static void main(String[] args) {
        //make new instance of scanner object, gives a pointer to it in the sc1 variable
        Scanner scanner = new Scanner(System.in);// a stream
        //
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        //sc1. click dot for methods menu available

        //must close to save memory, empty, method does not take parameters
        scanner.close();

        System.out.println("The number is : " + number);
    }
}
