package org.example.glab_303_3_1;

//The indexOf() method returns the index of the first occurrence of the specified character/substring within the string.
//if char/substring java returns -1
public class findString {
    public static void main(String[] args) {

        //Declare Sring RT string var = assign it the val "Java is fun"
        String str1 = "Java is fun";

        //initialize int result var
        int result;

        // getting index/position of character 's'
        //result is now the result of calling method on Str1 with "s" passed in
        //blank space counts as position
        result = str1.indexOf('s');

        //print pos of "s"
        System.out.println(result); // 6

        // getting index of character 'J'
        // The lastIndexOf() method returns
        // the position of the last occurrence of
        // specified character(s) in a string.
        result = str1.lastIndexOf('J');
        System.out.println(result); // 0

        // the last occurrence of 'a' is returned
        result = str1.lastIndexOf('a');
        System.out.println(result); // 3

        // character "not" in the string
        result = str1.lastIndexOf('j');
        System.out.println(result); // -1

        // getting the last occurrence of "ava" "index start"
        result = str1.lastIndexOf("ava");
        System.out.println(result); // 1

        // substring "not" in the string ???
        result = str1.lastIndexOf("java");
        System.out.println(result); // -1
    }
}
