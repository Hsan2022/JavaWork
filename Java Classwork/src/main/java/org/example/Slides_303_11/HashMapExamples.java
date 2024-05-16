//package org.example.Slides_303_11;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
////only one null key, any values with null
////also no order in hashmaps
////nan is not java component prob throws runtime exception of some sort
////null is the closest to nan
////In Java, theTreeMap class does not allow null keys
//
//public class HashMapExamples {
//    public static void main(String[] args) {
//        Map<String, String> stringMap = new HashMap<>();
//        stringMap.put("key", "value");
//        stringMap.put("key2", "actual value2");
//        stringMap.put("null value", "actual value 1234" );
//
//        //this is adding null a 2nd time which will overwrite the existing value
//        stringMap.put(null, "actual value 1234");
//
//        for( String key : stringMap.keySet() ){
//            //loop over all key and for each key get the value
//            String value = stringMap.get(key);
//            //printing key and value
//            System.out.println(key + " == " + stringMap.get(key));
//        }
//
//        // most important concept is above this line
//        //in this case the key is an integer and the value is a string
//        Map<Integer,String> map = new HashMap<>();
//        intMap.put(10, "ten");
//
//        //This happens sometimes but usually there are other ways of solving problems
//        //this would be a workaround or a hack for allowing duplicate values for keys
//        //this takes a bit of extra work to implement but if you need this then you need it
//        Map<String, List<String> listMap = new HashMap<>();
//
//
//
//    }
//}
