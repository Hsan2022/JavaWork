package org.example.Slides_303_4;

public class WhileLoopExample {
    //void main method only prints to console
    public static void main(String[] args) {
        //only until no longer true
        //manage your own exits

        int x = 1;

        while(true) {
            x = x + 1;
            System.out.println(x);
            if ( x == 10000) {
                break;
            }
        }

        do {
            x = x + 1;
        } while ( false);

    }
}
