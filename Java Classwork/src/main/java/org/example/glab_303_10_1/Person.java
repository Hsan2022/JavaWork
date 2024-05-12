package org.example.glab_303_10_1;

//creating a class
public class Person {
    //declare inst var, string type inside Person class
    //has no access modifiers, so package-private access
    String name;

    //static var in person - BELONG TO CLASS NOT INSTANCE OF CLASS
    static int lifeSpan = 60;
    static double ageFactor = 1.0;

    //Default constructor of the Person - method used to initialize objects of class
    public Person() {

        //constructor also initializes instance var to empty string
        //WHERE IS DATA TYPE RETURN?
        name = "";
    }

    //Another constructor for Person class
    //with parameters and initialized var w/val
    public Person(String aName) {
        name = aName;
    }

    //public access labeled method that returns val of instance name var
    public String getName() {
        return name;
    }

    //public access, does not return, labeled method
    //setter method for name variable
    public void setName(String aName) {
        name = aName;
    }

    //public access String RT toString method
    //Overrides? to return a str rep of the object
    //passing in person name param
    public String toString() {
        return ("Hello, my name is " + name);
    }

    //public access String RT labeled method
    //returns a simple string
    public String talk() {
        return ("I have nothing to say.");
    }


    //public access String RT labeled method
    //returns a simple string
    public String walk() {
        return ("I have nowhere to go.");
    }

    //public access static double RT labeled method
    //defined to calc lifespan by * two class variable
    public static double lifeSpan() {
        return (lifeSpan * ageFactor);
    }
}

