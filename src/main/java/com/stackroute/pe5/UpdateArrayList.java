package com.stackroute.pe5;

import java.util.List;
/*
 Write a Java program to update specific array element by given element and empty the array list .
 Input: [Apple, Grape, Melon, Berry]
 Output: [Kiwi, Grape, Mango, Berry]
 */

public class UpdateArrayList {
    public List<String> updateArray(List<String> array,int a,int b,String[] list){
        array.set(a,list[0]);
        array.set(b,list[1]);
        return array;
    }
}
