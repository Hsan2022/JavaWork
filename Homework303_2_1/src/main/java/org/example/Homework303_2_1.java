package org.example;

public class Homework303_2_1 {
    public static void main(String[] args) {
        //Write a program that declares two integer variables
        //assigns an integer to each, and adds them together
        //Assign the sum to a variable. Print out the result
        int num1 = 10;
        int num2 = 20;

        int sum = num1 + num2;
        System.out.println("The sum of num1 and num2 is : " + sum);

        //Write a program that declares two double variables
        //assigns a number to each, and adds them together
        //Assign the sum to a variable. Print out the result
        double d1 = 10.5d;
        double d2 = 20.5d;

        double sumD = d1 + d2;
        System.out.println("The sum of d1 and d2 is : " + sumD);

        //Write a program that declares an integer variable and a double variable
        //assigns numbers to each, and adds them together
        //Assign the sum to a variable. Print out the result
        int num3 = 76;
        double d3 = 5.64;

        double sum3 = num3 + d3;
        System.out.println("The sum of num3 and d3 is : " + sum3);
        System.out.println("The type of the result variable is: " + Double.valueOf(sum3).getClass().getName());

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

        //Write a program that declares two double variables
        //assigns a number to each, and divides the larger by the smaller number
        //Assign the result to a variable. Print out the result
        double var3 = 86.0;
        double var4 = 56.5;

        double var2div = (double) var4 / (double) var3;
        System.out.println("The division of var3 by var4 is : " + var2div);
        int result = (int) var2div;
        System.out.println("The result is : " + result);

        //Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y.
        //Declare a variable q and assign y/x to it and print q
        int x = 5;
        int y = 6;
        double q = y/x
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