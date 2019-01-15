package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SortedSetTest {


    @Before
    public void setUp() throws Exception {
        test = new SortedSet();

    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    SortedSet test;

    @Test
    public void TestSorting1() {

        List<String> set=new ArrayList<>(Arrays.asList( "Alice","Carner","Bluto","Harry","Olive"));
        ArrayList<String> arr=new ArrayList<>();
        arr.add("Alice");
        arr.add("Bluto");
        arr.add("Carner");
        arr.add("Harry");
        arr.add("Olive");
        assertEquals(arr,test.sortedSet(set));
    }
    @Test
    public void TestSorting2() {


        List<String> set=new ArrayList<>(Arrays.asList( "Alice","Carner","Bluto","Harry","Olive","Kevin","Peterson"));
        ArrayList<String> arr=new ArrayList<>();
        arr.add("Alice");
        arr.add("Bluto");
        arr.add("Carner");
        arr.add("Harry");
        arr.add("Kevin");
        arr.add("Olive");
        arr.add("Peterson");
        assertEquals("Error",arr,test.sortedSet(set));
    }
    @Test
    public void SortingFailure() {


        List<String> set=new ArrayList<>(Arrays.asList( "Alice","Carner","Bluto","Harry","Olive"));
        set.add("Alice");
        set.add("Carner");
        set.add("Bluto");
        set.add("Harry");
        set.add("Olive");
        set.add("Akshay");
        set.add("Badiger");

        assertNotNull(test.sortedSet(set));

    }
}