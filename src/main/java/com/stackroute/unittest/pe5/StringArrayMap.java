package com.stackroute.unittest.pe5;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StringArrayMap
{
    
    public Map<String, Boolean> checkOccurence(String[] input)
    {
        Map<String,Integer> map=new HashMap<String, Integer>();

        for(String str:input)
        {
            Integer num=map.get(str);
            num=(num==null)?1:++num;
            map.put(str,num);
        }
        Map<String,Boolean> result=new HashMap<String, Boolean>();
        for(Map.Entry<String,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>=2)
            {
                result.put(entry.getKey(),true);
            }
            else
                result.put(entry.getKey(),false);
        }
        return result;
    }


}
