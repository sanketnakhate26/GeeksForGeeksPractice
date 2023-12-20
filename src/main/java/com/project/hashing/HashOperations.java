package com.project.hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashOperations {
    public static void main(String args[])
    {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("sanket");
        hashSet.add("ram");
        hashSet.add("shyam");
        hashSet.add("radha");

        //search
        if(hashSet.contains("sanket"))
            System.out.println("sanket is present");

        System.out.println("hashset size = "+hashSet.size());

        System.out.println("hashset contains "+ Arrays.toString(hashSet.toArray()));

        Iterator<String> it = hashSet.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        //remove
        hashSet.remove("sanket");
        System.out.println("hashset contains "+ Arrays.toString(hashSet.toArray()));

        //clear hashSet
        hashSet.clear();

        System.out.println("hashset contains "+ Arrays.toString(hashSet.toArray()));
    }
}
