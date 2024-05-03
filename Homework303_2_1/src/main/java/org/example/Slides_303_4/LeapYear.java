package org.example.Slides_303_4;

import java.util.Scanner;

//This program first prompts the user to enter a year as an int, and checks if it is a leap year.
//A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
public class LeapYear {
    public static void main(String[] args) {
        //This program first prompts the user to enter a year as an int, and checks if it is a leap year.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        // A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.boolean isLeapYear = false;
        boolean isLeapYear = false;
        if ((year % 4 == 0 && year % 100 > 0) || (year % 400 == 0)) {
            isLeapYear = true;
        }

        System.out.println(year + " is a leap year " + isLeapYear);
    }
}
