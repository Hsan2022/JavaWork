package org.example.Slides_303_6;

import java.util.Arrays;

//very expensive because many loops 7 x 7
public class ArraySort {

    public static void main(String[] arr) {
        int[] array = {6, 0, 3, 5, 1, 10, 20, -1, -2};


        //how to exit, technique?
        //Boolean?


        boolean swapped = false;
        for (int outer = 0; outer < array.length - 1; outer++) {
            for (int inner = 0; inner < array.length - 1; inner++) {
                if (array[inner] > array[inner + 1]) {

                    //move a val here to compare
                    int temp = array[inner];
                    //compare
                    array[inner] = array[inner + 1];
                    //
                    array[inner + 1] = temp;
                    swapped = true;
                }
            }
            System.out.println(Arrays.toString(array));
            //space is allowed
            //is false
            if (!swapped) {
                break;
            }
        }
    }
}
