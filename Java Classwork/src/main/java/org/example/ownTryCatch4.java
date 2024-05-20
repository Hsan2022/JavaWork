package org.example;

//use input class to take input from user
//use buffered reader

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ownTryCatch4 {
    public static void main(String[] args) {
        int i, j, k = 0;

        //initialize a bufread obj named br from bread class
        //used to read text from user
        //inputSR used to create object to convert bytes stream to char stream
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        i = 8; //normal statement
        j = 2; //normal statement

        //declare and initialize an array using new keyword
        //int return type, label, is an array =
        //int return type array of size [4]
        //creating a new array object,
        //"new" is allocating memory for an arr of integers
        //"a" is an int array, it can hold 4 integer values, default all elements ara val of 0
        int a[] = new int[4];

        try {
            //anything divided bt zero will throw an exception
            k = i / j; //critical statement - put in try catch

            //for loop to add value to each el
            //BUT it is going to throw an exception
            //bc loop is going to pos 4 and
            // "a" array = 4 values [4] = pos, 0, 1, 2, 3
            //need to add another catch block
            //removing = resolves issue
            for(int c = 0; c <= 4; c++) {
                //0+1 = 1, 1+1 + 2, etc
                a[c] = c+1;
            }
            //for each var "value" in "a" array
            //print value one by one in a new line
            // = 1, 2, 3 , 4
            for(int value : a) {
                System.out.println(value);
            }
        }
        //catch Main Class is Exception e
        catch (ArithmeticException e) {
//            System.out.println(e); //works!
//            System.out.println("Cannot divide by zero" + e.getMessage()); //method does not show up
            System.out.println("Cannot divide by zero" + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Maximum number of values is 4");
        }

        //last exception is for unknown
        //Exception e must always be last so as not to throw an error
        catch (Exception e) {
            System.out.println("Unknown exception");
        }
        System.out.println(k);
    }
}
