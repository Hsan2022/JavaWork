package org.example.PA_303_4_1;

import java.util.Scanner;
//       !!!  need to find rule for difference in f gade and out of range
public class PA_303_4_1_5 {
    //void main method only prints to console
    public static void main(String[] args) {
        //declare a Scanner class to prompt user for an input number
        Scanner sc = new Scanner(System.in);
        //print user input number
        System.out.println("Enter the number : ");
        //assign input number to a variable: n
        int n = sc.nextInt();
        //declare if statetement A: 90-100
        if(n >= 90 && n <= 100) {
            System.out.println("Your grade for this class is an A");
        }
        //declare if statetement B: 80-89
        if(n >= 80 && n < 90) {
            System.out.println("Your grade for this class is a B");
        }
        //declare if statetement C: 70-79
        if(n >= 70 && n < 80) {
            System.out.println("Your grade for this class is a C");
        }
        //declare if statetement //D: 60-69
        if(n >= 60 && n < 70) {
            System.out.println("Your grade for this class is a D");
        }
        //declare if statetement //F: <60
        if(n < 60) {
            System.out.println("Your grade for this class is an F");
        }
        //declare if statetement
        if (n < 0 || n > 100){
            System.out.println("Out of Range");
        }
    }
}
