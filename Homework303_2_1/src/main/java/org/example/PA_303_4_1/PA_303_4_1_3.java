package org.example.PA_303_4_1;
//Write a program that declares 1 integer variable x, and then assigns 15 to it.
//Write an if-else-if statement that prints out “Less than 10” if x is less than 10; “Between 10 and 20” if x is greater than 10 but less than 20, and “Greater than or equal to 20” if x is greater than or equal to 20.
//Change x to 50 and notice the result.

public class PA_303_4_1_3 {
    //void main method only prints to console
    public static void main(String[] args) {
        //declare a var x, assign it the value of 15
        int x = 30;
        //declare an if statement condition
        if(x < 10) {
            //prints out “Less than 10” if x is less than 10
            System.out.println(x + " is less than 10");
        }
        if(x > 10 && x < 20) {
            //prints out x + " is between 10 and 20” if x is greater than 10 but less than 20
            System.out.println(x + " is between 10 and 20");
        }
        if(x > 20) {
             //prints out x is greater than or equal to 20”
            System.out.println(x + " is greater than or equal to 20");
        }
    }
}
