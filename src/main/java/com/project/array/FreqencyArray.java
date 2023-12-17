package com.project.array;

import java.util.HashMap;

public class FreqencyArray {
    public static void main(String args[])
    {
        int[] input = {10,10,10,25,30,30};

        HashMap<Integer,Integer> result = new HashMap<>();
        result.put(input[0],1);
        for(int i=1; i<input.length;i++)
        {
            if(result.containsKey(input[i])){
                result.put(input[i],result.get(input[i])+1);
            }
            else{
                result.put(input[i],1);
            }
        }

        System.out.println(result.toString());
    }

}
