package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class WordCountTest {


    @Before
    public void setUp() throws Exception {
        test = new WordCount();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    WordCount test;

    @Test

    public void CountTestSuccess() {

        String str = "one one -one___two,,three,one @three*one?two";
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 5);
        map.put("two", 2);
        map.put("three", 2);
        assertEquals( map, test.counterList(str));
    }

    @Test
    public void CountTestSuccess1() {

        String str = "two one -two_two,,three,one @three*one?two@four";


        Map<String, Integer> map = new HashMap<>();

        map.put("one", 3);
        map.put("two", 4);
        map.put("three", 2);
        map.put("four", 1);

        assertEquals(map, test.counterList(str));


    }

    @Test
    public void CountTestFailure() {

        String str="one two three one two three one two three";
        Map<String, Integer> map = new HashMap<>();
        map.put("one",3);
        map.put("two",3);
        map.put("three",3);
        assertNotNull("Error",test.counterList(str));
    }
}