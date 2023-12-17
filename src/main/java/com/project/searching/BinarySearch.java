package com.project.searching;

public class BinarySearch {
    public static void main(String args[]){
          int[] input = {1,3,5,7,9,11,13,15,17,19,21};
          int target = 15;

        System.out.println(binary(input,0,input.length-1,target));
    }
    public static int binary(int[] input, int start, int end, int target)
    {

        if (start <= end){
            int mid = (start + end)/2;
            if(input[mid] == target){
                return mid;
            }else if(input[mid] > target){
                return binary(input,start,mid-1,target);
            }else{
                return binary(input,mid+1,end,target);

            }
        }
        return -1;
    }
}
