package org.example.Slides_303_3_3;

public class StringBufferExampleExample {

    public static void main(String[] args) {
        //create new buffer var with a string passed in
        StringBuffer sb = new StringBuffer("filename.txt");
        //many methods/operations available on sb.------
        //such as insert, append, substrings etc
        //examples:


        //call StringBuffer variable sb's insert method
        //method takes two parameters( an index position, a data type variable + it's value)
        // 0123456789
        //filename.txt
        sb.insert(0, "new_");

        //call StringBuffer variable's replace method
        //method takes three parameters
        // (a start index position, an end index position + it's value, )
        // 0123456789
        //filename.txt
        sb.replace(0, 4, "old_");
        System.out.println(sb); //==> old_filename.txt


        //memorize that replace is first deleting
        //replace with much longer, 2 ops=delete 0-4 and the replace
        sb.replace(0, 4, "very_old_");
        System.out.println(sb); //==> very_old_filename


        //string buffer in reverse
        sb.reverse();
        System.out.println(sb); //==> txt.emanelif_dlo_yrev



        //not including position 4
        sb.delete(0, 4);
        System.out.println(sb); //==> emanelif_dlo_yrev

        //String joiner? not today

    }
}





