package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpdateArrayList {
    public static void main(String[] args){
        List<String> oldlist = new ArrayList(Arrays.asList("Apple","Grape","Melon","Berry"));
        String[] newlist = {"Kiwi","Mango"};
        System.out.println(updateArray(oldlist,0,2,newlist));

    }
    public static List<String> updateArray(List<String> array,int a,int b,String[] list){
        array.set(a,list[0]);
       array.set(b,list[1]);
       return array;
    }
}
