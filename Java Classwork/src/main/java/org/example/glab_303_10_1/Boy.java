package org.example.glab_303_10_1;

//public access class labeled with properties/behaviors from parent class - Person
public class Boy extends Person {
    //
    static double   ageFactor = 1.1;

    public String talk() {
        return(super.talk() + " ... but I love Java class.");
    }
    public String walk() {
        return("I am now walking");
    }
}
