package org.example.Slides_303_6;

public class SmallestValue {
    public static void main(String[] args) {
        int[] myArray = {199, 0, 2, 4, 6, 8, 10};


        //smallest possible
        int minVal = myArray[0];

        //bring out val from for loop
        for (int i = 0; i < myArray.length; i++) {
            int value = myArray[i];
            if (myArray[i] < minVal) {
                //199 < 199? no
                //0 < 199? yes ==> minVal is [1]
                //2 < 0? no
                //4 < 0? no
                //6 < 0? no
                //8 < 0? no
                //10 < 0? no, no more length so exit loop to next line
                minVal = myArray[i]; //print 0 bc minVal is myArray[1] from line 16
            }
        }
        System.out.println("minVal = " + minVal); //0
    }
}
