package org.example.Slides_303_3_3;

import java.util.StringJoiner;

//my own interpretation/extra solo practice

public class StringJoiner1 {
    public static void main(String[] args) {

        //used to make
        StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter
        // ----Adding values to StringJoiner  ----
        joinNames.add("Java");
        joinNames.add("Python");
        joinNames.add("C Sharp");
        joinNames.add("Javascript");
        System.out.println(joinNames);
    }
}

