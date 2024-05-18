package org.example.Slides_303_14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyRunLambdaForEach {

        public static void main (String[] args) {
            //creating a new String list under "names" variables
            List<String> names = new ArrayList<String>();

            names.add("Larry");
            names.add ("Steve") ;
            names.add ("James") ;
            names.add ( "Conan") ;
            names.add ( "Ellen") ;
            //lambda expression in java. callback in js
            //
            names.forEach (name -> {
                System.out.println (name);
            });

            System.out.println ("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

            //Larry
            //Steve
            //James
            //Conan
            //Ellen

            for (String name : names) {
                System.out.println (name);
            }

            //Larry
            //Steve
            //James
            //Conan
            //Ellen

            System.out.println ("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");



            //using lambda to filter etc, stream is only Lambdas
            names = names.stream().filter(name -> name.startsWith("E")).collect(Collectors.toList());

            for (String name : names) {
                System.out.println (name);
            }
            //[Ellen]
        }
    }
