package com.project.hashing;

import java.util.Arrays;
import java.util.HashSet;

public class CountDistinct {
    public static void main(String[] args)
    {
        Integer[] input = {1,3,3,4,5,5,6,6,6,7,8,9,10};
        HashSet<Integer> hashSet = new HashSet<Integer>(Arrays.asList(input));
        System.out.println(hashSet.size());

    }
}
