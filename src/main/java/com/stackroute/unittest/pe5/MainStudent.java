package com.stackroute.unittest.pe5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainStudent {
    public List<Student> studentInfo() {
        Student obj1 = new Student (1, "anjali", 22);
        Student obj2 = new Student (3, "vaibhav", 24);
        Student obj3 = new Student (2, "shubham", 20);
        Student obj4 = new Student (4, "abhishek", 10);
        Student obj5 = new Student (5, "kali", 22);
        List<Student> list = new ArrayList<Student>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);
        System.out.println(list);

        Collections.sort(list, new SortStudent ());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId() + " " + list.get(i).getName() + " " + list.get(i).getAge());
        }
        System.out.println(list);
        return list;
    }
}
