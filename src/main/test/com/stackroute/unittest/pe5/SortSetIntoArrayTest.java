package com.stackroute.unittest.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class SortSetIntoArrayTest {

    SortSetIntoArray obj;
    @Before
    public void setUp() throws Exception {
        obj = new SortSetIntoArray();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void sortArraySet() {
        Set<String> inputSet=new HashSet<String>();
        inputSet.add("Harry");
        inputSet.add("Olive");
        inputSet.add("Alice");
        inputSet.add("Bluto");
        inputSet.add("Eugene");
        System.out.println(inputSet);
        Set<String> resSet=new HashSet<String>();
        resSet.add("Alice");
        resSet.add("Bluto");
        resSet.add("Eugene");
        resSet.add("Harry");
        resSet.add("Olive");
        System.out.println(resSet);
        assertEquals(resSet,obj.sortArraySet(inputSet));
    }
}