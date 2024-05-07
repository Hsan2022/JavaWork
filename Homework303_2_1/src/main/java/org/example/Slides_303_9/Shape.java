package org.example.Slides_303_9;

//abstract is for its children force to implement

public abstract class Shape {

    private String name;

    protected void printName() {
        System.out.println("The name of a shape is " + name);
    }

    public abstract double calculatedArea();
}
