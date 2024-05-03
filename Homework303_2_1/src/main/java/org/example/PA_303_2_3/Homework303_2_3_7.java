package org.example.PA_303_2_3;





public class Homework303_2_3_7 {
    public static void main(String[] args) {
        //Write a program that declares two integer variables: x, and y, and then assigns 5 to x and 8 to y.
        int x = 5;
        int y = 8;
        // Create another variable sum and assign the value of ++x added to y,

        int sum = y += ++x; // 14 bc incremented x then summed it

        //int sum = y += x++; // postfix 13 bc calculated the sum, and then incremented x


        // and print the result.
        System.out.println(sum);
        //System.out.println(sum); //13
        // Notice the value of the sum (should be 14).
        // Now change the increment operator to postfix (x++) and re-run the program.
        // Notice what the value of the sum is. The first configuration incremented x,
        // and then calculated the sum, while the second configuration calculated the sum, and then incremented x.

    }
}
