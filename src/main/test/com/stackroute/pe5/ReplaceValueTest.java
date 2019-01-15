package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ReplaceValueTest {
    @Before
    public  void setUp() throws Exception {
        test = new ReplaceValue();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    ReplaceValue test;


    @Test
    public void TestValueChange1() {
        Map<String, String> list = new TreeMap<>();

        list.put("val1","java");
        list.put("val2","c++");

        Map<String, String> res = new TreeMap<>();

        res.put("val1"," ");
        res.put("val2","java");

        assertEquals(res, test.replaceValue(list)); }

    @Test
    public void TestValueChange2(){



        Map<String, String> hm = new TreeMap<>();

        hm.put("val1", "Shu");
        hm.put("val2", "Ban");

        Map<String, String> res = new TreeMap<>();

        res.put("val1", " ");
        res.put("val2", "Shu");

        assertEquals( res, test.replaceValue(hm));
    }

    @Test
    public void modifyFailure() {
        Map<String, String> hm = new TreeMap<>();

        hm.put("val1", "Nan");
        hm.put("val2", "nanee");

        assertNotNull(test.replaceValue(hm));

    }

}