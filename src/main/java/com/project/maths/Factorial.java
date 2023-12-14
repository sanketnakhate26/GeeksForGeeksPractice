package com.project.maths;

public class Factorial {
    public static void main(String args[])
    {
        int n = 12;
        if(n < 0)
            System.out.println("Factorial not possible");
        else
            System.out.println(fact(n));
    }
    static long fact(int n)
    {
        if(n == 0)
            return 1;
        return n * fact(n-1);
    }
}
