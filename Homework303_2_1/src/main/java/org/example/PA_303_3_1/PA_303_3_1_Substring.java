package org.example.PA_303_3_1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PA_303_3_1_Substring {
        public static void main(String[] args) {
            //new scanner class to create input stream from constructor
            Scanner scan = new Scanner(System.in);
            //initialize string delimiter with parameter r=carriage return n=new next line
            System.out.println("Enter the string: ");
            //System.out.println("enter length of string");
            //System.out.println(scan.nextLine() prints the whole string from input stream
            //System.out.println(scan.next() breaks up input by the delimiter default "a space"  prints only first word from input stream

            //uses line breaks, add reg expression, \endpoint, stop in
            scan.useDelimiter("\r\n");

            //declaring a string variable, equal to eval result of next method
            String str;
            //reads and stores 'string' input from user into a var
            str = scan.nextLine();

            //print stored str var
            System.out.println(str);
            //declaring a variable size set to the scan nextInt() method, reads str into int

            int size = str.length();
            //scan.nextInt();
            System.out.println(size);


            //Declare a variable called list with type List<String>
            //Call the constructor of LinkedList with the type parameter String
            //Sets the value of list to the result of step 2.
            //<param> is probably unnecessary= type interference but
            //List<'String'> list type info param prevents compiler warnings
            List<String> list = new LinkedList<String>();

            //declaring var set equal to max var = string.length() - size
            final int max = str.length() - size;
            //iterate through loop to add to list variable
            for (int i = 0; i <= max; i++) {
                //add inf to string param
                list.add(str.substring(i, i + size));
                System.out.println(list);
            }

            System.out.println(Collections.min(list));
            System.out.println(Collections.max(list));
        }

    }
//    public class Solution {
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        scan.useDelimiter("\r\n");
////        #This line reads the next token from the input
//          #next takes any data type
//        String string = scan.next();
//
//          #number of string length in "int"
//        int size = scan.nextInt();
//
//          #declaring new list, holds lists, easy to insert and remove
//        List<String> list = new LinkedList<String>();

//          #index pos, difference between both strings
//        final int max = string.length() - size;
//
//          # for loop 0 up to max(difference in int)
//        for (int i = 0; i <= max; i++) {

//          # makes a smaller string
//            list.add(string.substring(i, i + size));
//        }
//
//        System.out.println(Collections.min(list));
//        System.out.println(Collections.max(list));
//
//    }
//
//}