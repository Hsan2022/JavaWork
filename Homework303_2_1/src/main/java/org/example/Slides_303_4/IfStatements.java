package org.example.Slides_303_4;

import java.util.Scanner;

// in java it doesn't matter where functions are defined
public class IfStatements {
    public static void main(String[] args) {
        //needs user input
        //Scanner scanner = new Scanner(System.in);
        //int x = scanner.nextInt();
        int x = 9;
        x = test(x);
        // all will NOT execute because condition is met in one
        if (x < 10) {
            System.out.println("less than 10 ");
        } else if ( x < 20) {
            System.out.println("greater than 20 ");
        } else if (x < 30) {
            System.out.println("greater than 30 ");
        } else {
            System.out.println("greater than 40 ");
        }
        // all will execute because no else
        if ( x < 10) {
            System.out.println("less than 10 ");
        }
        if ( x < 20) {
            System.out.println("greater than 20 ");
        }
        if (x < 30) {
            System.out.println("greater than 30 ");
        }
    }

    public static int test(int x) {
        x = x = 1;
        return x;
    }
}
