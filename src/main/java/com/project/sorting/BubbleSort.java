package com.project.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[])
    {
        int[] input = {2,4,6,8,1,3,5,7};

        bubbleSort(input);
        System.out.println("After Sort : "+ Arrays.toString(input));
    }
    public static void bubbleSort(int[] input)
    {
        for(int i=0; i<input.length-1;i++)
            for(int j=0; j<input.length-1-i;j++)
            {
                if(input[j]>input[j+1]){
                    int temp = input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;
                }
            }
    }
}
