package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class BooleanMap {
    public static void main(String[] args) {
        String[] arr = {"a","b","c","d","a","c","c"};
        System.out.println(boolMap(arr));
    }
    public static Map<String,Boolean> boolMap(String[] list){
        Map<String,Boolean> output = new HashMap<>();
        boolean b;
        for(String item:list){
            if(output.get(item)==null){
                b = false;
                output.put(item,b);
            }
            else{
                b = true;
                output.put(item,b);
            }
        }
        return output;
    }

}
