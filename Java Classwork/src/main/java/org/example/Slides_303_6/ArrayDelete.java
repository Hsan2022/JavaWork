package org.example.Slides_303_6;
//there are faster ways of deleting a position
public class ArrayDelete {
    public static void main(String[] args) {
        //declare an array with values - hard code
        int[] array = {1, 2, 3, 4, 5};

        //delete val at pos 4

        //declare a variable initialized to the pos to be deleted
        int deletedPosition = 1;

        //checks if the deleted position valid
        if(deletedPosition < 0 || deletedPosition >= array.length) {
            System.out.println("position to delete is invalid");
        }


        //1. create a new array size -1 because we are removing exact 1 element
        int [] deleted = new int [array.length - 1];

        //2.copy the first elements up to but "not" including the deleted position
        for (int pos = 0 ; pos < 4 ; pos ++){
            deleted[pos] = array[pos];
        }

        //3. copy the last element into a pos -1 in the new array
        //
        for (int pos = deletedPosition + 1; pos < array.length ; pos ++) {
            array[pos - 1] = array[pos];
        }

        for (int value : deleted ) {
            System.out.print(value);
        }
    }
}
