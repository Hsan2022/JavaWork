//PA 303.2.1 - Practice Assignment
//Core Java - Variables
package org.example;

public class Homework303_2_1 {
    public static void main(String[] args) {
        //#1

        //Write a program that declares two integer variables
        //assigns an integer to each, and adds them together
        //Assign the sum to a variable. Print out the result
        int num1 = 10;
        int num2 = 20;

        int sum = num1 + num2;
        System.out.println("The sum of num1 and num2 is : " + sum);

        //#2
        //Write a program that declares two double variables
        //assigns a number to each, and adds them together
        //Assign the sum to a variable. Print out the result
        double d1 = 10.5d;
        double d2 = 20.5d;

        double sumD = d1 + d2;
        System.out.println("The sum of d1 and d2 is : " + sumD);

        //#3
        //Write a program that declares an integer variable and a double variable
        //assigns numbers to each, and adds them together
        //Assign the sum to a variable. Print out the result
        int num3 = 76;
        double d3 = 5.64;

        double sum3 = num3 + d3;
        System.out.println("The sum of num3 and d3 is : " + sum3);
        System.out.println("The type of the result variable is: " + Double.valueOf(sum3).getClass().getName());

        //#4
        //Write a program that declares two integer variables
        //assigns an integer to each, and divides the larger number by the smaller number
        //Assign the result to a variable. Print out the result
        int var1 = 60;
        int var2 = 70;

        double vdiv = (double) var2 / (double) var1;
        System.out.println("The division of var1 and var2 is : " + vdiv);
        //Now change the larger number to a decimal. What happens? What corrections are needed?
        var1 = (int) 80.0;
        vdiv = (double) var2 / (double) var1;
        System.out.println("The division of var1 and var2 is : " + vdiv);

        //#5
        //Write a program that declares two double variables
        //assigns a number to each, and divides the larger by the smaller number
        //Assign the result to a variable. Print out the result
        double var3 = 86.0;
        double var4 = 56.5;
        //Now change the larger number to a decimal. What happens? What corrections are needed?

        double var2div = (double) var4 / (double) var3;
        System.out.println("The division of var3 by var4 is : " + var2div);
        int result = (int) var2div;
        System.out.println("The result is : " + result);

        //#6
        //Write a program that declares two double variables,
        //assigns a number to each, and divides the larger by the smaller number. Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.

        int x = 5;
        int y = 6;
        double q = (double) y /x;
        System.out.println("The result is : " + q);

        //assign y to q. Print q again.
        q = (double) y;
        System.out.println("The result is : " + q);

        //Write a program that declares a named constant and uses it in a calculation
        //?
        //?

        //Write a program that represent products at a cafe
        // Product prices
        double cafe = 3.30;
        double frozenCafe = 7.81;
        double latte = 5.87;

        // Order quantities
        int cafeNum = 2;
        int frozenCafeNum = 8;
        int latteNum = 4;
    }
}