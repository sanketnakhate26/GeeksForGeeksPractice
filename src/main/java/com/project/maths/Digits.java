package com.project.maths;

// program to find the no of digits in a number
public class Digits {
    public static void main(String args[])
    {
        int x = 0;

        System.out.println("No of digits = "+findDigits(x));
    }

    static int findDigits(int x)
    {
        x = x >= 0? x : -x;
        int count = 0;
        if(x == 0)
            return 0;
        else{
            while (x > 0)
            {
                x = x / 10;
                count ++;
            }
            return count;
        }
    }

}
