package com.project.maths;

public class TrailingZerors {
    public static void main(String args[])
    {
        int n = 251;
        System.out.println(findTrailingZerors(n));
    }
    static int findTrailingZerors(int n)
    {
        int result = 0;
        for(int i = 5; i<=n; i=i*5)
        {
            result = result + n/i;
        }
        return result;
    }
}
