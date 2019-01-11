package com.stackroute.pe5;

import java.util.*;


public class SortedSet {
    public static void main(String[] args) {
        List<String> nan = new ArrayList<>(Arrays.asList("Alice","Bluto","Eugene","Harry Olive"));
        System.out.println(sortedSet(nan));
    }
    public static List<String> sortedSet(List<String> list){
        Set<String> st = new TreeSet<>();
        for(String item:list){
            st.add(item);
        }
        List<String> nan = new ArrayList<>();
               nan.addAll(st);
     return nan;
    }
}
