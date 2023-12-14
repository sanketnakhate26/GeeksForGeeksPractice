package com.project.maths;

public class Prime {
    public static void main(String args[])
    {
        int n = 21;
        System.out.println("Is "+n+" is prime : "+isPrime(n));
    }
    static boolean isPrime(int n)
    {
        if(n==1)
            return false;
        if(n == 2 || n == 3)
            return true;
        if(n%2== 0 || n%3==0)
            return false;
        for(int i=5; i*i <=n; i=i+5)
        {
            if(n%i == 0 || n%(i+2)==0)
                return false;
        }
        return true;
    }
}