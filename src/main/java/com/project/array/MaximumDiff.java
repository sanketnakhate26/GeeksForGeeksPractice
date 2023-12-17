package com.project.array;

public class MaximumDiff {
    public static void main(String args[])
    {
        int[] input = {2,-3,10,6,4,18,1};

        System.out.println("Max Diff : "+maxDiff(input));
    }

    public static int maxDiff(int[] input)
    {
        int max = input[1]-input[0];
        int minValue = input[1] > input[0] ? input[0] : input[1];

        for(int j=1; j<input.length;j++)
        {
            max = Math.max(max,input[j]-minValue);
            minValue = Math.min(minValue,input[j]);
        }

        return max;


    }
}
