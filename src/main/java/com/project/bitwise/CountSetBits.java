package com.project.bitwise;

public class CountSetBits {
    public static void main(String args[])
    {
        int n = 15;
        System.out.println("Count of set bits : "+Cunninghram(n));
    }
    static int countSetBits(int n)
    {
        int count = 0;
        for(int i=0;i<32;i++)
        {
            if((n & 1) != 0)
                count++;
            n=n>>1;
        }
        return count;
    }
    static int Cunninghram(int n)
    {
        int count=0;
        while(n>0)
        {
            n = n & (n-1);
            count++;
        }
        return count;
    }
}
