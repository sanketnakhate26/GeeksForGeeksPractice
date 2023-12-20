package com.project.hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapOperations {
    public static void main(String args[])
    {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"sanket");
        hashMap.put(2,"ram");
        hashMap.put(3,"krishna");

        //search for key
        if(hashMap.containsKey(1))
            System.out.println("1 is present");

//        System.out.println(hashMap.toString());

        System.out.println("using iteration");
        // using iteration
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext())
            System.out.println(it.next());

        System.out.println("using entryset");
        //using entry set
        hashMap.entrySet().forEach(integerStringEntry -> {
            System.out.println(integerStringEntry.toString());
        });

        System.out.println("using enterset key val");
        for(Map.Entry<Integer,String> es : hashMap.entrySet())
            System.out.println(es.getKey() + " : "+es.getValue());
    }
}
