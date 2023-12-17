package com.project.recursion;

public class Josephus {
    public static void main(String args[])
    {
        int n = 9;
        int k = 3;

        System.out.println(getJosephus(n,k));
    }
    public static int getJosephus(int n, int k)
    {
        if(n==1)
            return 1;
//        System.out.println("n = "+n);
        return (getJosephus(n-1,k)+ k-1)%n + 1 ;
    }


}
