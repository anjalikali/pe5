package com.stackroute.unittest.pe5;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;
    public class ListUpdateTest {

        ListUpdate obj;
        @Before
        public void setUp() throws Exception {
            obj = new ListUpdate();
        }

        @After
        public void tearDown() throws Exception {
            obj = null;
        }

        @Test
        public void manipulateList() {
            List<String> list1 = asList("Apple", "Grape", "Melon", "Berry");
            List<String> list2 = asList("Apple", "Grape", "Mango", "Berry");
            assertEquals(list2,obj.manipulateList(list1,"Melon","Mango"));

            List<String> list3 = asList("Apple", "Grape", "Mango", "Berry");
            List<String> list4 = asList("Kiwi", "Grape", "Mango", "Berry");
            assertEquals(list4,obj.manipulateList(list3,"Apple","Kiwi"));

            List<String> list5 = asList("Kiwi", "Grape", "Mango", "Berry");
            List<String> list6 = asList("Kiwi", "Guava", "Mango", "Berry");
            assertEquals(list6,obj.manipulateList(list5,"Grape","Guava"));

            List<String> list7 = asList("Kiwi", "Guava", "Mango", "Berry");
            List<String> list8 = asList("Kiwi", "Guava", "Mango", "Blueberry");
            assertEquals(list8,obj.manipulateList(list7,"Berry","Blueberry"));
        }

        @Test
        public void emptyList() {
            List<String> list = new ArrayList ();

            List<String> list1 = new ArrayList();
            list1.add("Apple");
            list1.add("Grape");
            list1.add("Melon");
            list1.add("Berry");
            assertEquals(list,obj.emptyListNew(list1));

            List<String> list3 = new ArrayList();
            list3.add("Apple");
            list3.add("Grape");
            list3.add("Mango");
            list3.add("Berry");
            assertEquals(list,obj.emptyListNew(list3));

            List<String> list5 = new ArrayList();
            list5.add("Kiwi");
            list5.add("Guava");
            list5.add("Mango");
            list5.add("Berry");
            assertEquals(list,obj.emptyListNew(list5));
        }
    }

