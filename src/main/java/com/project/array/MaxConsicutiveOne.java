package com.project.array;

public class MaxConsicutiveOne {
    public static void main(String args[])
    {
        int[] input = {-3,8,-2,4,-5,6};

        System.out.println("Max Sum = "+maxSum(input));
    }
    public static int maxSum(int[] input)
    {
        int max = 0;
        int currMax=0;
        for(int i=0;i<input.length;i++)
        {
             currMax = currMax + input[i];
             currMax = currMax > 0 ? currMax : 0;
             max = Math.max(max,currMax);
        }
        return max;
    }
}
