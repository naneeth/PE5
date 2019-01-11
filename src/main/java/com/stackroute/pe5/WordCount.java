package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {
    public static void main(String[] args) {

        System.out.println(counterList("one one -one___two,,three,one @three*one?two"));
    }
public static Map<String, Integer> counterList(String s){
    String str = "";
    Pattern ptr = Pattern.compile("[a-zA-Z]+");
    Matcher mtr = ptr.matcher(s);
    while(mtr.find()){
        str += mtr.group()+" ";
    }
    str = str.trim();
    String[] check = str.split(" ");
    String last = "";

    Map<String,Integer> output = new HashMap<>();

    for(int i=0;i<check.length;i++) {
            if(!last.contains(check[i])) {
                int count = 0;
                last += check[i];
               for(int j=0;j<check.length;j++){


                   if(check[i].equals(check[j])){

                       count++;
                   }
                   output.put(check[i],count);
               }
            }

        }
    return output;
    }

}


