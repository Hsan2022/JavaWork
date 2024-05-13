package org.example;

public class StringBuffer3Practice {
    public static void main(String[ ] args) {
        // ------ insert()----------------
        //create a StringBuffer obj with param passed in
        StringBuffer s = new StringBuffer("Java");


        //using insert method(pos, string to put in place of position
        s.insert(4, "language");
        System.out.println(s);


        // --------- replace()---------
        //create a StringBuffer obj with param passed in
        StringBuffer sT = new StringBuffer("Java");
        //using replace method(Startpos, EndBeforePosition, string to put in place of positions
        sT.replace(0, 2, "Hello");
        System.out.println(sT);


        //create a StringBuffer obj with param passed in
        StringBuffer str = new StringBuffer("Welcome to Java Fullstack ");
        System.out.println("Original string: " + str);



        System.out.println("Substring with start index: " + str.substring(5));
        System.out.println("Substring with start and end index: " + str.substring(5, 10));
    }

}
