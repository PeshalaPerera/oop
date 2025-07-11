package com.company;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<>();
        //Adding elements to map
        map.put(1,"Amit");
        map.put(5,"Rahul");
        map.put(2,"Jai");
        map.put(6,"Amit");
        map.put(8,"Amit");
        //Traversing Map
        System.out.println(map);

        Set set=map.entrySet();//Converting to Set so that we can traverse
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
