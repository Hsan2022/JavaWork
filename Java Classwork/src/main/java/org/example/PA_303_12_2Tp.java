package org.example;


public class PA_303_12_2Tp {
    public static void iterateAndDivide(int[] arr, int startAt, int endAt, int divideBy) {
        try {
            System.out.println("Dividing by " + divideBy + ":");
            //
            if (startAt < endAt) {
                for (int i = startAt; i <= endAt; i++) {
                    System.out.println("  Index " + i + ": " + (arr[i] / divideBy));
                }
            } else {
                for (int i = startAt; i >= endAt; i--) {
                    System.out.println("  Index " + i + ": " + (arr[i] / divideBy));
                }
            }
        }
        // Add catch blocks to handle any exceptions that may occur.
        catch (ArithmeticException e) {
            System.out.println("  ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("  ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("  Exception caught: " + e.getMessage());
        }
    }
}

class Solution {
    public static void main(String[] args) {
        int[] arr = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        PA_303_12_2Tp.iterateAndDivide(arr, 2, 4, 2);
        PA_303_12_2Tp.iterateAndDivide(arr, 2, 20, 1);
        PA_303_12_2Tp.iterateAndDivide(arr, 10, 2, 0);
        PA_303_12_2Tp.iterateAndDivide(arr, 10, -1, -2);
    }

}