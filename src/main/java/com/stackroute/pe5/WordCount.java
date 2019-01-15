package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Write a program to find the number of counts in the following String.Store the output in
 * Map<String,Integer>as key value pair.
 */
public class WordCount {
    public Map<String, Integer> counterList(String originalString) {
        String replaceString = "";
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(originalString);
        while (matcher.find()) {
            replaceString += matcher.group() + " ";
        }
        replaceString = replaceString.trim();
        String[] splitString = replaceString.split(" ");
        String string = "";
        Map<String, Integer> output = new HashMap<>();
        for (int i = 0; i < splitString.length; i++) {
            if (!string.contains(splitString[i])) {
                int count = 0;
                string += splitString[i];
                for (int j = 0; j < splitString.length; j++) {
                    if (splitString[i].equals(splitString[j])) {
                        count++;
                    }
                    output.put(splitString[i], count);
                }
            }
        }
        return output;
    }

}


