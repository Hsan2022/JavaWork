package org.example;

public class ownTryCatch2 {
    public static void main(String[] args) {
        int i, j, k = 0;
        i = 8; //normal statement
        j = 0; //normal statement
        try {
            //anything divided bt zero will throw an exception
            k = i / j; //critical statement - put in try catch
        }
        //catch Main Class is Exception e
        catch (Exception e) {
//            System.out.println(e); //works!
//            System.out.println("Cannot divide by zero" + e.getMessage()); //method does not show up
            System.out.println("Cannot divide by zero" + e); //method does not show up

            System.out.println("Cannot divide by zero");
        }
    }
}
