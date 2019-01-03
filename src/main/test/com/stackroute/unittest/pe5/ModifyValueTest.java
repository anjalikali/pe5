package com.stackroute.unittest.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ModifyValueTest {

    ModifyValue obj;
    @Before
    public void setUp() throws Exception {
        obj = new ModifyValue ();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void modifyValue1() {
        Map<String,String> input=new HashMap<String, String>();
        input.put("value1","mars");
        input.put("value2","saturn");
        System.out.println(input);
        Map<String,String> result=new HashMap<String, String>();
        result.put("value1"," ");
        result.put("value2","mars");
        System.out.println(result);
        assertEquals(result,obj.modifyKeyValueInMap(input));
    }
    @Test
    public void modifyValue2() {
        Map<String,String> input=new HashMap<String, String>();
        input.put("value1","JAVA");
        input.put("value2","C++");
        System.out.println(input);
        Map<String,String> result=new HashMap<String, String>();
        result.put("value1"," ");
        result.put("value2","mars");
        System.out.println(result);
        assertEquals(result,obj.modifyKeyValueInMap(input));
    }
}