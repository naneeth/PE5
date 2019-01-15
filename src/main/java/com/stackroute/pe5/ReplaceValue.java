package com.stackroute.pe5;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/*
 * Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
 * Modify and return the given map as follows:
 * a. If the key `val1` has a value, set the key `val2` to have that value, and
 * b. Set the key `val1` to have the value `" "` (empty string ).
 */

public class ReplaceValue {
    public Map<String, String> replaceValue(Map<String, String> input) {

        Iterator<Map.Entry<String, String>> it = input.entrySet().iterator();
        String value = "";
        String keyValue = "";
        int i = 0;
        while (it.hasNext()) {
            Map.Entry<String, String> map = it.next();
            keyValue = map.getKey();
            if (keyValue != null && i == 0) {
                value = map.getValue();
                input.put(keyValue, " ");
                i++;
            } else if (keyValue != null) {
                input.put(keyValue, value);
            }
        }
        return input;
    }
}
