package com.project.bitwise;

public class KthBitSet {
    public static void main(String args[])
    {
        int n = 15;
        int k=3;

        System.out.println("Is "+k+"th bit is set : "+isKthSet(n,k));
    }
    static boolean isKthSet(int n, int k)
    {
        if((n>>(k-1) & 1) != 0)
            return true;
        return false;
    }
}
