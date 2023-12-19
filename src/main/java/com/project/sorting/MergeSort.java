package com.project.sorting;


import java.util.Arrays;

public class MergeSort {
    public static void main(String args[])
    {
        int[] input= {2,1,4,3,5,9,2,34,31,67,87,56,9,88,3};
        int low = 0;
        int high = input.length-1;
        mergeSort(input,low,high);
        System.out.println(Arrays.toString(input));
    }
    public static void mergeSort(int[] input, int low, int high)
    {
        if(low<high){
            int mid = low + (high-low)/2;
            mergeSort(input,low,mid);
            mergeSort(input,mid+1,high);
            merge(input,low,mid,high);
        }
    }
    public static void merge(int[] input, int low, int mid, int high)
    {
        int n1 = mid-low+1;
        int n2 = high-mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        //copy array
        for(int i=0; i<n1; i++)
            left[i]=input[low+i];
        for (int i=0; i<n2; i++)
            right[i]=input[mid+1+i];
        int i=0, j=0, k=low;
        while (i<n1 && j<n2)
        {
            if(left[i]<right[j])
                input[k++]=left[i++];
            else
                input[k++]=right[j++];
        }
        while (i<n1)
            input[k++]=left[i++];
        while (j<n2)
            input[k++]=right[j++];
    }
}
