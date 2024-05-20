package org.example.glab_303_3_1;
//The replaceAll() method replaces each substring that matches the regex of the string with the specified text.
//The syntax of the replaceAll() method is:

//string.replaceAll(String regex, String replacement)
//regex - a regex (can be a typical string) that is to be replaced
//replacement - matching substrings are replaced with this string

public class DemoReplaceAll {
    public static void main(String[] args) {
        String str1 = "Java123is456fun";

        // regex for sequence of digits
        // the "\\" is necessary to escape backlash
        //we're sort of filtering for a sequence of digits

        //"\\d+" is a regular expression that matches one or more digits.
        String regex = "\\d+";

        // replace all occurrences of numeric with a space string
        // digits by a space
        System.out.println(str1.replaceAll(regex, " ")); //Java is fun
    }
}
