//package org.example.Slides_303_13;
//
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class FileWriterExample {
//
//    public static void main(String[] args) {
//
//        try {
//            //append to end of file. no new line character, need \n
//            File output = new File("output.txt");
//
//            FileWriter fileWriter = new FileWriter(output, false);
//
//            for ( int count = 0; count < 15; count++) {
//                fileWriter.write("Line (" + count + ") This is my first sentence writing to a file")
//            }
//
//            //flush says to save its internal beffer right now even if totally full
//            //writing to disk is expensive
//            FileWriter.flush();
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
