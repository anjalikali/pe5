package com.stackroute.unittest.pe5;
import java.util.ArrayList;
import java.util.List;

public class ListUpdate {

    public static List<String> manipulateList(List<String> oldList, String oldStr, String newStr){
        int index = oldList.indexOf(oldStr);
        if(index != -1){
            oldList.set(index, newStr);
        }
        return oldList;
    }

    public List<String> emptyListNew(List<String> oldList){
        int i;
        oldList.removeAll(oldList);
        return oldList;
    }
}
