package org.example.PA_303_4_1;
// Write an if-else statement that prints “Out of range” if the number is less than 10 or greater than 20 and prints “In range” if the number is between 10 and 20 (including equal to 10 or 20).
// Change x to 5 and notice the result.

public class PA_303_4_1_4 {
    //void main method only prints to console
    public static void main(String[] args) {
        //declare an x var, assign it the val of 15
        int number = 15;
        //declare an if statetement with cond
        if(number < 10) {
            System.out.println(number + " out of range");
        }
        if(number >= 10 && number <= 20) {
            System.out.println(number + " is in range");
        }
    }
}




