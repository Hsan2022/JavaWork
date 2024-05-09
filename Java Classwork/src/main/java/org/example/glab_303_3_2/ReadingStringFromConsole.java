package org.example.glab_303_3_2;

import java.util.Scanner;

//When the program is run, the execution waits after printing “Enter three words separated by spaces:,” where the user would enter a string similar to “hello world” as shown in the following console window.
//The program prints the string read from the console input in the next step. The whole output in the console would be as shown in the following.
//Enter three words separated by spaces: Hello Java Learners
//s1 is Hello
//s2 is Java
//s3 is Learners
public class ReadingStringFromConsole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three words separated by spaces: ");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();
        System.out.println("s1 is " + s1);
        System.out.println("s2 is " + s2);
        System.out.println("s3 is " + s3);
    }
}

