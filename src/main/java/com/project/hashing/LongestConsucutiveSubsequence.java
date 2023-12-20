package com.project.hashing;

import java.util.HashSet;

public class LongestConsucutiveSubsequence {
    public static void main(String args[])
    {
        int[] input = {1,3,9,2,8};

        System.out.println("Length = "+findSum0Subarray(input));
    }
    public static int findSum0Subarray(int[] input)
    {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int x : input)
            hashSet.add(x);
        int max = 0;
        for(int x : input)
        {
            if(hashSet.contains(x-1)==false)
            {
                int curr = 1;
                while (hashSet.contains(x+curr))
                    curr++;

                max = Math.max(max,curr);
            }
        }
        return max;
    }
}
