package com.project.maths;

public class ComputingPower {
    public static void main(String args[])
    {
        int x = 5, n = 4;
        System.out.println("power("+x+","+n+") = "+computingPower(x,n));
    }
    static int computingPower(int x, int n)
    {
        if(n==0)
            return 1;
        int temp = computingPower(x,n/2);
        temp = temp * temp;
        if(n%2==0)
            return temp;
        else
            return x * temp;
    }
}
