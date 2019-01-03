package com.stackroute.unittest.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringFrequencyCountTest {

    StringFrequencyCount obj;
    @Before
    public void setUp() throws Exception {
        obj = new StringFrequencyCount ();

    }

    @After
    public void tearDown() throws Exception {
        obj =  null;
    }

    @Test
    public void countFreqOfWords() {
        String  str = "one one -one___two,,three,one @three*one?two";
        Map<String,Integer> freq=new HashMap<String, Integer>();
        freq.put("one",5);
        freq.put("two",2);
        freq.put("three",2);
        assertEquals(freq,obj.CountFreqOfWords(str));
    }
    @Test
    public void countFreqOfWords1() {
        String str = "one one -one___two,,three,one @three*one?two";
        Map<String, Integer> freq = new HashMap<String, Integer>();
        freq.put("1", 0);
        freq.put("two", 2);
        freq.put("three", 2);
        assertNotEquals(freq, obj.CountFreqOfWords(str));
    }
    @Test
    public void countFreqOfWords2() {
        String str = "one one one -one___two,,three,one @three*one?two";
        Map<String, Integer> freq = new HashMap<String, Integer>();
        freq.put("one", 6);
        freq.put("two", 2);
        freq.put("three", 2);
        assertEquals(freq, obj.CountFreqOfWords(str));
    }

}