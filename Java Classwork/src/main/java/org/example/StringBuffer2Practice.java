package org.example;

public class StringBuffer2Practice {
    public static void main(String[] args) {
        //creating new object from StringBuffer class
        //since no args passed, it's empty
        StringBuffer sb = new StringBuffer();

        //object is currently empty so will print an empty string
        System.out.println(sb);

        //adds string or space to end of string
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");

        System.out.println(sb);

        //coverting sb stringbuffer to regular java object
        //by declaring String return data type = var.toString()
        String message = sb.toString();
        System.out.println(message);
    }
}
