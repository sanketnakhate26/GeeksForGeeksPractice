package com.project.hashing;

import java.util.HashSet;

public class findSum0Subarray {
    public static void main(String args[])
    {
        int[] input = {2,6,30,-4,-5,8};

        System.out.println("is 0 sum subset is present : "+findSum0Subarray(input));
    }
    public static boolean findSum0Subarray(int[] input)
    {
        HashSet<Integer> hashSet = new HashSet<>();
        int prefixSum = 0;
        for(int i=0;i<input.length;i++)
        {
            prefixSum = prefixSum+input[i];
            if(hashSet.contains(prefixSum))
                return true;
            else
                hashSet.add(prefixSum);
        }
        return false;
    }
}
