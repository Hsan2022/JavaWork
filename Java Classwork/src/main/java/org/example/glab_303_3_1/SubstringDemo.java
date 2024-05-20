package org.example.glab_303_3_1;

//The substring() method extracts a substring from the string and returns it. The syntax of the substring() method is
//stringObj.substring(int startIndex, int endIndex)

public class SubstringDemo {

    public static void main(String[] args) {

        //declare a rt String var = string
        String str1 = "java is fun";

        //call substring method on string str1, pass in positions to be extracted and returned
        // extract substring from index 0 to 3, emd is exclusive
        System.out.println(str1.substring(0, 4));

        //ALSO VALID
//        String smallerString = str1.substring(0, 4);
//        System.out.println(smallerString);
//

    }
}
