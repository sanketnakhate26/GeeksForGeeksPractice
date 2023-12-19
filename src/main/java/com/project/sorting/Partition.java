package com.project.sorting;

import java.util.Arrays;

public class Partition {
    public static void main(String args[])
    {
        int[] input = {29,9,4,12,7,3,67,4,6};
        int target = 7;

        doPatition(input,target);
    }
    public static void doPatition(int[] input, int target)
    {
        int p1 = 0;
        int p2 = input.length-1;

        while (p1<=p2){
            while (input[p1]<target)
                p1++;
            while (input[p2]>target)
                p2--;

            if(input[p1]>target)
            {
                int temp = input[p1];
                input[p1]=input[p2];
                input[p2]=temp;
                p1++;
                p2--;
            }
            p1++;
        }
        System.out.println(Arrays.toString(input));
    }
}
