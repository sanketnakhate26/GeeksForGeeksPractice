package com.project.array;

public class RotateUsingRecursion {
    public static void main(String args[])
    {
        int[] input = {1,2,3,4,5,6,7,8,9,10};
        int len = input.length;
        int d = 5;

        System.out.print("Before rotate : ");
        printArray(input);

        rotateArray(input,0,d-1);
        rotateArray(input,d,len-1);
        rotateArray(input,0,len-1);

        System.out.println();
        System.out.print("After rotate : ");
        printArray(input);
    }

    public static void rotateArray(int[] input, int low, int high)
    {
        while(low<high)
        {
            int temp = input[low];
            input[low]=input[high];
            input[high]=temp;

            low++;
            high--;
        }
    }
    public static void printArray(int[] input)
    {
        for (int i=0; i<input.length;i++)
        {
            System.out.print(input[i]+" ");
        }
    }
}
