package org.example.Slides_303_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ForLoopExample {
    //old school :), void main method only prints to console
    public static void main(String[] args) {
        //nested for loop
        for(int count = 10; count > 0; count -- ) {
            if(count % 2 == 0) {
                System.out.print("This is an even number");

                for(int d = 0 ; d < 5 ; d++) {
                    System.out.print("The count = " + count + "." + d);
                }
            }
        }
        //
        List<String> stringList = new ArrayList<>();

        stringList.add("First Element");
        stringList.add("Two"); //pos1
        stringList.add("Three");
        stringList.add("Four"); //pos 3
        stringList.add("5"); //pos 4
        //we can

    }

}
