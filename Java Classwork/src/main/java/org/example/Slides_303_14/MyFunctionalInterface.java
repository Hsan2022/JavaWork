package org.example.Slides_303_14;


//KBA2
@FunctionalInterface
public interface MyFunctionalInterface {

    public Integer sqr(int a);
    default String sqr(String a){
        return a + a;
    }
}
