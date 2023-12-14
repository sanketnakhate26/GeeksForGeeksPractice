package com.project.bitwise;

public class FindOddOccuring {
    public static void main(String args[])
    {
        int[] list = {4,5,4,4,4,6,6};

        System.out.println("Odd one is : "+getOddOccuring(list));
    }
    static int getOddOccuring(int[] list)
    {
        int odd = 0;
        for(int i=0;i<list.length;i++)
            odd = odd ^ list[i];

        return odd;
    }
}
