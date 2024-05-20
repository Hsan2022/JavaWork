package org.example.PA_303_12_1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


//how to use a try-catch block to handle exceptions

//public can be accessed from other classes
public class TryCatch {
    //main() method is executed when run
    public static void main(String[] args) {

        //scanner obj "sc" created - it wil read input from user
        Scanner sc = new Scanner(System.in);

        //these are nested try-catch blocks is used to catch exceptions
        //somewhat like is-else statements

        try {
            //read two int from user
            //print division of both
            try {
                int x = new Integer(sc.nextInt());
                int y = new Integer(sc.nextInt());
                System.out.println("" + (x / y));
            } catch (InputMismatchException e) {
                System.out.println("java.util.InputMismatchException");
            }
            //general exception
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
