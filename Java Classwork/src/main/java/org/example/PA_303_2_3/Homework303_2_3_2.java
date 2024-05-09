package org.example.PA_303_2_3;


//Write a program that declares a variable x, and assigns 150 to it,
// and prints out the binary string version of the number. Now use the right shift operator (>>) to shift by 2 and assign the result to x. Write a comment indicating what you anticipate the decimal and binary values to be. Now print the value of x and the binary string.
//Perform the preceding exercise with the following values:
//225
//1555
//32456
public class Homework303_2_3_2 {
    //public for access, void to print only, main method for all methods
    public static void main(String[] args) {
        //Write a program that declares an integer a variable x, assigns the value 2 to it
        int x = 225;
        int x9 = 1555;
        int x10 = 32456;


        //prints out the binary string version of the number ( Integer.toBinaryString(x) ).
        //declare a String obj and set equal to ( Integer.toBinaryString(x) )
        //This method returns the binary string assoc w/ that number
        String binary1 = Integer.toBinaryString(x);
        String binary2 = Integer.toBinaryString(x9);
        String binary3 = Integer.toBinaryString(x10);

        //Print a string inserting both variables: x + " in binary is: " + binary1
        System.out.println(x + " in binary is: " + binary1); // prints 225 in binary is: 11100001
        //Print a string inserting both variables: x9 + " in binary is: " + binary2
        System.out.println(x9 + " in binary is: " + binary2); // prints 1555 in binary is: 11000010011
        //Print a string inserting both variables: x10 + " in binary is: " + binary3
        System.out.println(x10 + " in binary is: " + binary3); // prints 32456 in binary is: 111111011001000


        // Eric said on zoom not to do it!!!

        //use the left shift operator (<<) to shift by 1 and assign the result to x
        //Number to be shifted
        int n1 = -2;
        // Number of positions
        int n2 = 1;
        // Shifting x by n positions towards
        // left using left shift operator
        int x2 = n1 << n2;

        // Before printing the results, write a comment with the predicted decimal value and binary string.
        // Now, print out x in decimal form and in binary notation. Perform the preceding exercise with the following values:
        // predict 1, 3.4
        System.out.println(x2);    // prints -4
    }
}
