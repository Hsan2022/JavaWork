package org.example;
//In Java, HashMap is an implementation of the Map interface provided by the Java Collections Framework. It's part of the java.util package.
//

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMapExercises {
    //1. Write a Java program to associate the specified value with the specified key in a HashMap.
    public static void main(String[] args) {

        //creating a new dictionary, an instance of the HashMap class
        //new map has parameters (key is type Int and val is type String)
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        //using map put method to store in key "1" the value of ""Red"" ex: {1: "Red"}
        //called key val pairs
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");

        //using a for-each instead of for loop to lookup each key and return its value
        //Entry() returns the contents of map, entrySet() returns set of keys
        //
        for (Map.Entry x : hash_map.entrySet()) {
            //
            //System.out.println(x.getKey() + " " + x.getValue());
        }

        //2. Write a Java program to count the number of key-value (size) mappings in a map.

        //use previous hashmap
        //declare a var to store size/key-value pair or "mappings"
        //use the map size method to get size from map var
        //print size

        int size = hash_map.size();

        //print size map variable
        //System.out.println(size);


        //use "size" variable and hash_map var within a string print statement but hash_map returns key-val mappings
        //System.out.println("The number of key-value mappings in " + hash_map + " is: " + size);


        //gets map var name by referencing its class and a method but returns class/HashMap?
        //System.out.println("Number of key-value mappings in " + hash_map.getClass().getSimpleName() + " is: " + size);


        //How to directly reference the instance variable name of the HashMap within the print statement?

        //3. Write a Java program to copy all mappings from the specified map to another map.

        // create two different hash maps
        HashMap<Integer, String> hash_map1 = new HashMap<Integer, String>();
        HashMap<Integer, String> hash_map2 = new HashMap<Integer, String>();

        // populate hash maps, input key value mapping referencing hash map variable, call put method of map
        hash_map1.put(1, "Red");
        hash_map1.put(2, "Green");
        hash_map1.put(3, "Black");
        //System.out.println("\nValues in first map: " + hash_map1);

        // populate hash maps, input key value mapping referencing hash map variable, call put method of map
        hash_map2.put(4, "White");
        hash_map2.put(5, "Blue");
        hash_map2.put(6, "Orange");
        //System.out.println("\nValues in second map: " + hash_map2);

        // put all values in map2 using the putAll() hashmap method
        hash_map2.putAll(hash_map1);

        //\n means new line character, string and appends the values stored in variable
        //System.out.println("\nNow values in second map: " + hash_map2);

        //4. Write a Java program to remove all mappings from a map.

        HashMap<Integer, String> hash_map4 = new HashMap<Integer, String>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");

        // print the map
        //System.out.println("The Original linked map: " + hash_map4);
        // Removing all the elements from the linked map
        //hash_map.clear();
        //System.out.println("The New map: " + hash_map4);

        //5. Write a Java program to check whether a map contains key-value mappings (empty) or not.

        HashMap<Integer, String> hash_map5 = new HashMap<Integer, String>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");
        // check if map is empty
        boolean result = hash_map5.isEmpty();
        // check the result
//        System.out.println("Is hash map empty: " + result);
        // Removing all the elements from the linked map
        hash_map5.clear();
        // check if map is empty
        result = hash_map5.isEmpty();
        // check the result
//        System.out.println("Is hash map empty: " + result);


        //6. Write a Java program to get a shallow copy of a HashMap instance.
        HashMap<Integer, String> hash_map6 = new HashMap<Integer, String>();
        hash_map6.put(1, "Red");
        hash_map6.put(2, "Green");
        hash_map6.put(3, "Black");
        hash_map6.put(4, "White");
        hash_map6.put(5, "Blue");
        // print the map
//        System.out.println("The Original map: " + hash_map6);
        HashMap<Integer, String> new_hash_map6 = new HashMap<Integer, String>();
        new_hash_map6 = (HashMap) hash_map6.clone();
//        System.out.println("Cloned map: " + new_hash_map6);


        //7. Write a Java program to test if a map contains a mapping for the specified key.

        HashMap<String, Integer> hash_map7 = new HashMap<String, Integer>();
        hash_map7.put("Red", 1);
        hash_map7.put("Green", 2);
        hash_map7.put("Black", 3);
        hash_map7.put("White", 4);
        hash_map7.put("Blue", 5);
        // print the map
//        System.out.println("The Original map: " + hash_map7);
//        System.out.println("1. Is key 'Green' exists?");
        if (hash_map.containsKey("Green")) {
            //key exists
            //System.out.println("yes! - " + hash_map.get("Green"));
        } else {
            //key does not exists
            //System.out.println("no!");
        }

        //System.out.println("\n2. Is key 'orange' exists?");
        if (hash_map.containsKey("orange")) {
            //System.out.println("yes! - " + hash_map.get("orange"));
        } else {
//            System.out.println("no!");
        }

        //8. Write a Java program to test if a map contains a mapping for the specified value.

        HashMap<String, Integer> hash_map8 = new HashMap<String, Integer>();
        hash_map8.put("Red", 1);
        hash_map8.put("Black", 3);
        hash_map8.put("White", 4);
        hash_map8.put("Blue", 5);
        // print the map
//        System.out.println("The Original map: " + hash_map8);
//        System.out.println("1. Is key 'Green' exists?");
        if (hash_map8.containsKey("Green")) {
            //key exists
//            System.out.println("yes! - " + hash_map8.get("Green"));
        } else {
            //key does not exists
//            System.out.println("no!");
        }

//        System.out.println("\n2. Is key 'orange' exists?");
        if (hash_map8.containsKey("orange")) {
//            System.out.println("yes! - " + hash_map8.get("orange"));
        } else {
//            System.out.println("no!");
        }


       //9. Write a Java program to create a set view of the mappings contained in a map.

        HashMap < Integer, String > hash_map9 = new HashMap < Integer, String > ();
        hash_map9.put(1, "Red");
        hash_map9.put(2, "Green");
        hash_map9.put(3, "Black");
        hash_map9.put(4, "White");
        hash_map9.put(5, "Blue");
        // create set view for the map
        Set set = hash_map9.entrySet();
        // check set values
        System.out.println("Set values: " + set);


        //10. Write a Java program to get the value of a specified key in a map.

        HashMap<Integer,String> hash_map10= new HashMap<Integer,String>();
        hash_map10.put(1,"Red");
        hash_map10.put(2,"Green");
        hash_map10.put(3,"Black");
        hash_map10.put(4,"White");
        hash_map10.put(5,"Blue");
        // get value of key 3
        String val=(String)hash_map10.get(3);
        // check the value
        System.out.println("Value for key 3 is: " + val);

        //11. Write a Java program to get a set view of the keys contained in this map.

        HashMap<Integer,String> hash_map11= new HashMap<Integer,String>();

        hash_map11.put(1,"Red");
        hash_map11.put(2,"Green");
        hash_map11.put(3,"Black");
        hash_map11.put(4,"White");
        hash_map11.put(5,"Blue");

        // get keyset value from map
        Set keyset = hash_map11.keySet();

        // check key set values
        System.out.println("Key set values are: " + keyset);


        //12. Write a Java program to get a collection view of the values contained in this map.

        HashMap<Integer,String> hash_map12= new HashMap<Integer,String>();
        hash_map12.put(1,"Red");
        hash_map12.put(2,"Green");
        hash_map12.put(3,"Black");
        hash_map12.put(4,"White");
        hash_map12.put(5,"Blue");

        // checking collection view of the map
        System.out.println("Collection view is: "+ hash_map.values());
    }
}

