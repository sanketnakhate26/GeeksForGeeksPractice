package com.project.array;

public class Leader {
    public static void main(String args[])
    {

        int[] input = {7,12,4,10,6,5,11};

        getLeaders(input);

    }
    public static void getLeaders(int[] input)
    {
        int len = input.length;
        System.out.println("length = "+len);

        if(len == 1)
        {
            System.out.println(input[0]);
            return;
        }

        int currMax = input[len-1];
        System.out.print(input[len-1]+" ");
        int i = len-2;
        while (i >= 0){
            if(input[i] > currMax)
            {
                System.out.print(input[i]+" ");
                currMax=input[i];
            }
            i--;
        }

    }
}
