package org.example.glab_303_3_2;

import java.util.Scanner;

public class ReadingStringFromConsole2 {
    public static void main(String[] args) {

        //scanner reading the next token/word using the next()
        Scanner input = new Scanner(System.in);

        //prints prompt for user
        System.out.print("Enter a character: ");

        //scanner reads and stores input
        String s = input.nextLine();

        //hit enter then prints next statement
        //stores the eval result of just the first chr at string
        char ch = s.charAt(0);
        System.out.println("The character entered is " + ch);
    }
}
