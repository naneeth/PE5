package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

/*
 * Write a program where an array of strings is input and output is a Map< String ,boolean> where
 * each different string is a key and its value is true if that string appears 2 or more times in the array.
 */
public class BooleanMap {
    public Map<String,Boolean> boolMap(String[] list){
        Map<String,Boolean> output = new HashMap<>();
        boolean repeat;
        for(String item:list){
            if(output.get(item)==null){
                repeat = false;
                output.put(item,repeat);
            }
            else{
                repeat = true;
                output.put(item,repeat);
            }
        }
        return output;
    }

}
