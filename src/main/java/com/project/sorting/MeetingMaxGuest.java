package com.project.sorting;

import java.util.Arrays;
import java.util.HashMap;

public class MeetingMaxGuest {
    public static void main(String[] args)
    {
        int[] arr = {600,700,800};
        int[] dep = {801,930,830};

        System.out.println(findMaxGuest(arr,dep)+" ");
    }
    public static int findMaxGuest(int[] arr, int[] dep)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int i=0,j=0;
        int curr=0,result=0;
        while (i<arr.length && j<dep.length)
        {
            if(arr[i] < dep[j])
            {
                curr++;
                i++;
            }
            else
            {
                curr--;
                j++;
            }

            result=Math.max(result,curr);
        }
        return result;
    }
}
