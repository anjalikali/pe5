package com.stackroute.unittest.pe5;
import java.util.*;

public class SortSetIntoArray
{
    public Set<String> sortArraySet(Set<String> set)
    {
        List<String> list = new ArrayList<String>();
        list.addAll(set);
        Collections.sort(list);
        System.out.print("Sorted set is: ");

        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.print("ArrayList from set: ");

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        Set<String> newSet=new LinkedHashSet<String>(list);
        return newSet;
    }
}
