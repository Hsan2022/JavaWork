package org.example.PA_303_2_3;

public class Homework303_2_3_4 {
    public static void main(String[] args) {
        //Write a program that declares three int variables: x, y, and z. Assign 7 to x and 17 to y.

        int x = 7;
        int y = 17;

        // Write a comment that indicates what you predict will be the result of the bitwise and operation on x and y.
        //prediction: x, 12344   y, 778999

        //Now use the bitwise OR "|" operator to derive the decimal and binary values

        //and assign the result to z
        int z = x | y;
        //print z as result of operation
        System.out.println(z);// prints 23

        //prints out the binary string version of the number ( Integer.toBinaryString(x) ).
        //declare a String obj and set equal to ( Integer.toBinaryString(z) )
        //This method returns the binary string assoc w/ that number
        String binary1 = Integer.toBinaryString(z);

        //Print a string inserting z variable: z + " in binary is: " + binary1
        System.out.println(z + " in binary is: " + binary1); // 23 in binary is: 10111
    }
}
