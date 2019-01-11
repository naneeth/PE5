package com.stackroute.pe5;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ReplaceValue {
    public static void main(String[] args) {
        Map<String, String> nan = new TreeMap<>();
        nan.put("val1", "mars");
        nan.put("val2", "saturn");
        System.out.println(replaceValue(nan));
    }

    public static Map<String, String> replaceValue(Map<String, String> nan) {

        Iterator<Map.Entry<String,String>> it =  nan.entrySet().iterator();
        String value="" ;
        String keyValue="";
        int i=0;
        while(  it.hasNext() )
        {
            Map.Entry<String,String> stl=it.next();
            keyValue=stl.getKey();
            if( keyValue != null && i ==0 )
            {
                value= stl.getValue();
                nan.put(keyValue," ");
                i++;
            }
            else if( keyValue !=null )
            {
                nan.put(keyValue,value);
            }

        }
        return nan;
    }
}
