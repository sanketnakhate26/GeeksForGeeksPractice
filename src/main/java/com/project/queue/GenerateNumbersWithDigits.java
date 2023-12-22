package com.project.queue;

import java.util.ArrayDeque;

public class GenerateNumbersWithDigits {
    public static void main(String args[])
    {
        int n=10;

        doMagic(n);

    }
    public static void doMagic(int n)
    {
        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.add("5");
        queue.add("6");
        for(int i=0; i<n; i++)
        {
            String current = queue.remove();
            System.out.print(current+" ");
            queue.add(current+"5");
            queue.add(current+"6");
        }
    }
}
