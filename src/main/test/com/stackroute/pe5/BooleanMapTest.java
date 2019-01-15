package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BooleanMapTest {


    @Before
    public void setUp() throws Exception {
        test = new BooleanMap();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    BooleanMap test;

    @Test
    public void TestBoolean1() {


        String arr[] = {"a", "b", "c", "e", "a", "c", "c", "d"};

        HashMap<String, Boolean> map = new HashMap<>();

        map.put("a", true);
        map.put("b", false);
        map.put("c", true);
        map.put("d", false);
        map.put("e", false);

        assertEquals( map, test.boolMap(arr));
    }

    @Test
    public void BooleanTest2() {

        String arr[] = {"a", "a", "a", "b", "b", "b", "b", "b", "c", "d"};

        HashMap<String, Boolean> map = new HashMap<>();

        map.put("a", true);
        map.put("b", true);
        map.put("c", false);
        map.put("d", false);

        assertEquals( map, test.boolMap(arr));
    }

    @Test
    public void StringBooleanFailure() {
        BooleanMap test = new BooleanMap();
        String  arr[] = {"a","a","a","b","b","b","b","b","c"};

        assertNotNull("Error",test.boolMap(arr));
    }

}