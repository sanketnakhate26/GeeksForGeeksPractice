package com.project.stack;

public class Histogram1 {
    public static void main(String args[])
    {
        int[] input = {4,2,1,5,6,3,2,4,2};

        System.out.println(getArea(input));
    }
    public static int getArea(int[] input)
    {
        int maxArea=0;
        for(int i=0;i<input.length;i++)
        {
            int currArea = (getLeftLength(input,i) + getRightLength(input,i) + 1) * input[i];
            maxArea=Math.max(maxArea,currArea);
        }
        return maxArea;
    }
    public static int getLeftLength(int[] input, int index)
    {
        int ptr=index-1;
        int count=0;
        while (ptr>=0 && input[index]<=input[ptr])
        {
            ptr--;
            count++;
        }
        return count;
    }
    public static int getRightLength(int[] input, int index)
    {
        int ptr=index+1;
        int count=0;
        while (ptr<input.length && input[index]<=input[ptr])
        {
            ptr++;
            count++;
        }
        return count;
    }
}
