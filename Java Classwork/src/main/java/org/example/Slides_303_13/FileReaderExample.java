//package org.example.Slides_303_13;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//
////watches for end of file
//
//public class FileReaderExample {
//
//    public static void main(String[] args) throws Exception {
//
//        File input = new File("output.txt");
//        FileReader reader= new FileReader(input);
//
//        //create low level reader(buffer) to read file
//        BufferedReader br = new BufferedReader(reader);
//
//        //reads first line as s string
//        //priming var
//        //buf consumes char
//        String line = br.readLine();
//
//        while ( line != null ) {
//            //read next line, not null so loops over until line null
//            System.out.println(line);
//            line = br.readLine();
//        }
//    }
//}
