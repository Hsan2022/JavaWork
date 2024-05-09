package org.example.Slides_303_6;

import java.util.Arrays;

public class ArrayDeleteFunction {
    //params(int []source=array, int deletedPosition = number)
    //
    public static int[] delete(int[] source, int deletePosition) {
        //declaring a new result var equals to array -1
        int[] result = new int[source.length - 1];
        //looping through
        for (int pos = 0, resultPos = 0; pos < source.length; pos++) {
            //if curr val in loop is NOT val to be deleted then:
            if (pos != deletePosition) {
                //
                result[resultPos++] = source[pos];
            }
        }
        return result;
    }

    //using main method to run delete method
    public static void main(String[] args) {

        //declare int arr var
        int[] array = {1, 2, 3, 4, 5};

        //declare int var = 5 to be deleted
        int deletedPosition = 4;


        //reassign the array var to the eval result of calling
        //the delete method passing in array and position to be deleted
        array = delete(array, deletedPosition);

        // Print the resulting array using the java 'for each' method
        for (int num : array) {
            System.out.println(num);
        }

        // Print the resulting array using Arrays.toString method passing in array as arg
        System.out.println(Arrays.toString(array));
    }
}

