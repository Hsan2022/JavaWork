//package org.example.Slides_303_13;
//
//import java.io.File;
//import java.io.IOException;
//
//public class File_Example {
//
//    public static void main(String[] args) throws IOException {
//        //relative path from where you are
//        // "../../.." - go up one directory, dot. means current position:present working directory
//        //do not recycle file in code bc will not send to directory
//
//        //use absolute path to create new file
//        //c is root of hard drive in mac, c is ms
//        //forward slash in mac, in ms double \\ bc \ is escape character
//
//        File f = new File("D:/Users/heleodoraorduno/2024-RTT-62/Java-classWork/Java Classwork/src/main/java/org/example/Slides_303_13/File_Example.java");
//        System.out.println(f.getAbsolutePath());
//
//        File[] files = f.listFiles();
//        for (File file : files) {
//            System.out.println("    " + file.getCanonicalFile());
//            if (f.isDirectory()) {
//                System.out.println(" is a directory");
//            } else {
//                System.out.println("  is a file");
//            }
//
//
//            File file = new File(pathname:".//newfile.txt")
//            file.createNewFile();
//        } catch (IOException ioe) {
//            System.out.println(ioe.getMessage());
//        }
//    }
//}
