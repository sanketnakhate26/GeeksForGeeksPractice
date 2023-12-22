package com.project.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class PreviousGreater {
    public static void main(String args[])
    {
        int[] input = {15,10,18,12,4,6,2,8};

        printPreGreater(input);
    }
    public static void printPreGreater(int[] input)
    {
        Deque<Integer> deque = new ArrayDeque<>();
        if(input.length==0)
            return;

        deque.push(input[0]);
        System.out.print("-1 ");

        for(int i=1;i<input.length;i++)
        {
            while (!deque.isEmpty()){
                if(deque.peek()>input[i])
                {
                    System.out.print(deque.peek()+" ");
                    deque.push(input[i]);
                    break;
                }
                else
                {
                    deque.pop();
                }
            }
            if(deque.isEmpty())
            {
                System.out.print("-1 ");
                deque.push(input[i]);
            }
        }
    }
}
