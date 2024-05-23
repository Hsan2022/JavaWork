package org.example.DSAHR;


//DOES NOT RUN!!
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.*;
import java.util.*;

//Write your code here
//input- int
//output - print int
//declare Add class

class Add {
    //declare method and args
    //varargs parameter, short for "variable-length arguments". Pass a var num of args of the specified type to a method.
    public void add(int ...args) {
        //declare int var, initialize to zero
        int s = 0;
        //iterate over arr
        for (int i = 0; i < args.length; i++) {
            //to s add val of each element to var s
            s += args[i];
            //check to see if curr element is last
            if (i < args.length - 1) {
                //if curr is last element, print it and a + sign
                System.out.print(args[i] + "+");
            }
            //if not last ele, then print curr ele, = sign and s var
            else{
                System.out.println(args[i] + "=" + s);
            }

        }
    }

}



public class Solution {

    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            int n6=Integer.parseInt(br.readLine());
            Add ob=new Add();
            ob.add(n1,n2);
            ob.add(n1,n2,n3);
            ob.add(n1,n2,n3,n4,n5);
            ob.add(n1,n2,n3,n4,n5,n6);
            Method[] methods=Add.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}

