package com.project.maths;

public class Palindrome {
    public static void main(String args[])
    {
        int n = 1;

        if(isPalindrome(n))
            System.out.println("Number "+n+" is palindrome");
        else
            System.out.println("Number "+n+" is not palindrome");
    }
    static boolean isPalindrome(int n)
    {
        int copyOfN = n;
        if(copyOfN < 0)
            return false;
        else if(copyOfN < 10)
            return true;
        else{
            int rev = 0;
            while (copyOfN > 0)
            {
                int lastDigit = copyOfN % 10;
                copyOfN = copyOfN / 10;
                rev = rev * 10 + lastDigit;
            }
            if(n == rev)
                return true;
            else
                return false;
        }
    }
}
