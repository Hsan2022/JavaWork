package org.example.PA_303_10_1;

//Scenario: In our game app, we have many types of monsters that can attack.
// You will design a superclass called Monster and define the method of attack() in the superclass..
// You will design subclasses called FireMonster, WaterMonster, and StoneMonster.
// The subclasses will then provide their actual implementation.
// In the main program, we will declare instances of the superclass, substitute them with the actual subclass,
// and invoke the method defined in the superclass.




//Abstract Classes:
//Can have both abstract and regular methods.
//Cannot be instantiated, which means that an abstract class does not allow you to create objects of its type.
//Are declared by using abstract keyword.
//Can be extended by another class that will provide implementation for abstract methods.
//Classes extending an Abstract Class:
//Must provide logic for every abstract method.
//Must be substituted wherever the Abstract Class is needed.

//because method is not used
//any concrete subclass of Monster must provide an "implementation" for this method.
//abstract - non-access modifier
//abstract method has NO implementation or body{}.The body of abstract method is provided by the subclass (inherited from).
//The declaration of an abstract method must end with a semicolon (;).
//if super class is public then DO NOT NEED @OVERRIDE
abstract class Monster {
    abstract String attack();

}

//subclasses, extend to inherit method attack
class FireMonster extends Monster {
    public FireMonster(String r2u2) {

    }

    String attack() {
        return "Attack with fire";
    }
}

class WaterMonster extends Monster {
    public WaterMonster(String u2r2) {

    }

    String attack() {
        return "Attack with water";
    }
}

class StoneMonster extends Monster {
    public StoneMonster(String a2b2) {

    }

    String attack() {
        return "Attack with stones";
    }
}

//IMPLEMENTATION
public class TestMonster {
    public static void main(String[] args) {
        // Program at the "interface" defined in the superclass.
        // Declare instances of the superclass, substituted by subclasses.
        //superclass/copy name = mold of fire monster
        Monster m1 = new FireMonster("r2u2");   // upcast
        Monster m2 = new WaterMonster("u2r2");  // upcast
        Monster m3 = new StoneMonster("r2r2");  // upcast

        // Invoke the actual implementation of m1, m2, m3
        System.out.println(m1.attack());  // Run FireMonster's attack() //==> Attack with fire
        System.out.println(m2.attack());  // Run WaterMonster's attack() //==> Attack with water
        System.out.println(m3.attack());  // Run StoneMonster's attack() //==> Attack with stones

        // m1 dies, generates a new instance and re-assign to m1.
        //m1 variable is equal to a new stoneMonster
        m1 = new StoneMonster("a2b2");  // upcast
        System.out.println(m1.attack());  // Run StoneMonster's attack() ==> Attack with stones



        //new instance of superclass using constructor
        Monster m4 = new Monster() { // Anonymous subclass
            String attack() {
                return "!^_&^$@+%$* I don't know how to attack!";
            }
        };
        System.out.println(m4.attack());
    }
}
