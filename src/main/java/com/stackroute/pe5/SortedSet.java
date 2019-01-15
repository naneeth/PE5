package com.stackroute.pe5;

import java.util.*;

/*
 * Write a program to implement set interface which sorts the given randomly ordered names in
 * ascending order. Convert the sorted set in to an array list
 */
public class SortedSet {
    public List<String> sortedSet(List<String> list){
        Set<String> set = new TreeSet<>();
        for(String item:list){
            set.add(item);
        }
        List<String> outputList = new ArrayList<>();
        outputList.addAll(set);
        return outputList;
    }
}
