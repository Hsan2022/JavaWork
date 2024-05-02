package org.example;

public class StringExample {
    public static void main(String[] args) {
        String str = "Whatever I want to type in this string is okay. Add more to this";
        System.out.println("The length of the string is: " + str.length());

        String str2 = str.toUpperCase();
        System.out.println("The upper case string is: " + str2.toUpperCase());

        String filename = "document.pdf";
        //make a substring to get file name, take a portion of substring depending on position(s) requested
        System.out.println("The filename is: " + filename + " and the length is: " + filename.length());
        //where the period is in the string
        System.out.println("The period is at index " + filename.indexOf('.'));
        //don't understand this part
        //System.out.println("The file extension " + filename.substring(filename.indexOf));
        System.out.println("The name of the file is " + filename.substring(0, filename.lastIndexOf('.')));
    }
}
