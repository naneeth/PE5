package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class UpdateArrayListTest {

    @Before
    public void setUp() throws Exception {
        test = new UpdateArrayList();
    }


    @After
    public void tearDown() throws Exception {
        test = null;
    }

    UpdateArrayList test;

    @Test

    public void TestUpdateSuccess() {
        String[] newlist = {"Kiwi", "Mango"};
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");
        list.add("orange");
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Kiwi");
        list1.add("Grape");
        list1.add("Mango");
        list1.add("Berry");
        list1.add("orange");
        assertEquals("Error", list1, test.updateArray(list, 0, 2, newlist));

    }

    @Test

    public void TestUpdateSuccess1() {
        String[] newlist = {"Kiwi", "Mango"};
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");
        list.add("orange");

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Apple");
        list1.add("Kiwi");
        list1.add("Melon");
        list1.add("Berry");
        list1.add("Mango");

        assertEquals("Error", list1, test.updateArray(list, 1, 4, newlist));

    }

    @Test
    public void updateFailure() {
        String[] newlist = {"Kiwi","Mango"};
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");
        list.add("orange");

        assertNotNull("Error", test.updateArray(list,0, 2,newlist));

    }

}