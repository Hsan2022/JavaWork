package org.example;

import java.util.Scanner;


//remember to import java.util.Scanner just above
public class ExtraPracticeDecimalBinary {
    //[]=array
    //main (arguments/parameters) = functionality "que"
    // run(minutos, millas) = params

    //invoke/call method run(arguments/100min, 30millas)
    //arg
    public static void main (String[] args) {
        //a scanner obj is created w/constructor to read a decimal and binary input from the user
        //Scanner class, label = initialized to new Scanner passing input stream
        Scanner sc = new Scanner(System.in);
        //use print method to prompt user
        System.out.println("Enter a decimal number: ");
        //data type/int so decimal can be accepted, label = evaluated result of obj method
        //nextInt() - returns the next int token from the scanner, attached to obj var
        //calling the method nexInt of scanner class by using subject sc, storing the result var decimal
        int decimal = sc.nextInt();
        System.out.print("Binary form of " + decimal +" is : ");
    }
}
