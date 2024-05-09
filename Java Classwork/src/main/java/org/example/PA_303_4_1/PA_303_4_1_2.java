package org.example.PA_303_4_1;

public class PA_303_4_1_2 {
    //void main method only prints to console
    public static void main(String[] args) {
        //Write a program that declares 1 integer variable x, and then assigns 7 to it.
        int x = 7;
        //Write an if-else statement that
        if(x < 10) {
            // prints out “Less than 10” if x is less than 10, and
            System.out.println(x + " is less than 10");
        } else if(x > 10) {
            // “Greater than 10” if x is greater than 10.
            System.out.println(x + " is greater than 10");
        }
        //Change x to 15 and notice the result.
        x = 15;
    }
}
