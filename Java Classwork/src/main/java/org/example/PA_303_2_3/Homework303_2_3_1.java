package org.example.PA_303_2_3;

//9
//17
//88

public class Homework303_2_3_1 {
    //public for access, void to print only, main method for all methods
    public static void main(String[] args) {
        //Write a program that declares an integer a variable x, assigns the value 2 to it
        int x = 2;
        int x9 = 9;
        int x10 = 17;
        int x11 = 88;


        //prints out the binary string version of the number ( Integer.toBinaryString(x) ).
        //declare a String obj and set equal to ( Integer.toBinaryString(x) )
        //This method returns the binary string assoc w/ that number
        //data type, label eval to = CCCapital Int method .tpBinaryString(arg)
        //The binnary is a String because interger used the tobinaryString method passing in x var
        String binary1 = Integer.toBinaryString(x); // assigning and invoking, not returning
        String binary2 = Integer.toBinaryString(x9); // assigning and invoking not returning
        String binary3 = Integer.toBinaryString(x10); // assigning and invoking not returning
        String binary4 = Integer.toBinaryString(x11); // assigning and invoking not returning

        //"Print" a string inserting both variables: x + " in binary is: " + binary1
        System.out.println(x + " in binary is: " + binary1); // prints 2 in binary is: 10
        //"Print" a string inserting both variables: x9 + " in binary is: " + binary2
        System.out.println(x9 + " in binary is: " + binary2); // prints 9 in binary is: 1001
        //"Print" a string inserting both variables: x10 + " in binary is: " + binary3
        System.out.println(x10 + " in binary is: " + binary3); // prints 17 in binary is: 10001
        //"Print" a string inserting both variables: x11 + " in binary is: " + binary4
        System.out.println(x11 + " in binary is: " + binary4); // prints 88 in binary is: 1011000


        // Eric said on zoom not to do it!!!
        //use the left shift operator (<<) to shift by 1 and assign the result to x

        //Number to be shifted
        int n1 = -2;
        // Number of positions
        int n2 = 1;
        // Shifting x by n positions towards
        // left using left shift operator
        int x2 = n1 << n2; //==>> -2 moved left by 1

        // Before printing the results, write a comment with the predicted decimal value and binary string.
        // Now, print out x in decimal form and in binary notation. Perform the preceding exercise with the following values:
        // predict 1, 3.4


        System.out.println(x2);    // prints -4
        //data type, var name
        float y1 = x;
        float y2 = x9;
        float y3 = x10;
        float y4 = x11;

        System.out.println("A decimal value of variable x: " + y1); // 2.0
        System.out.println("A decimal value of variable x9: " + y2); // 9.0
        System.out.println("A decimal value of variable x10 " + y3); // 17.0
        System.out.println("A decimal value of variable x11: " + y4); // 88.0



    }
}


