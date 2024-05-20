package org.example.PA_303_12_1;


//method to find the power cal
//finds power of n raised to p by
//calling the power() passing n, p, decrementing p by 1 each pass
//method checks that ints are valid, not neg or 0


public class ExceptionHandling {


    //a method with RT long, takes two int parameters, "n" and "p"
    //power() can throw an Exception, any kind(subclass) of e
    long power(int n,int p) throws Exception{

        //exception handling - //
        //if either of these int vars are neg, then throw e
        if((n<0) || (p<0)){
            throw new Exception("n or p should not be negative.");
        }

        //if either of these int vars are 0, then throw e
        else if((n==0) && (p==0)){
            throw new Exception("n and p should not be zero.");
        }


        //Base cases//
        //Conditions handle base cases of the function power()

        //if "n" is 0, then return 0
        else if(n==0){
            return 0;
        }

        //if "p" is 0, then return 1
        else if(p==0){
            return 1;
        }

        //this is the recursive calc
        //it runs when neither arg is neg.
            //

        else{
            return n*power(n,p-1);
        }
    }
}
