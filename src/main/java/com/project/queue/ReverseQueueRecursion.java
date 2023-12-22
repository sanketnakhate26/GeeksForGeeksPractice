package com.project.queue;

import java.util.ArrayDeque;

public class ReverseQueueRecursion {
    public static void main(String args[])
    {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Original : "+queue.toString());
        reverse(queue);
        System.out.println("After Reverse : "+queue.toString());
    }
    public static void reverse(ArrayDeque<Integer> queue)
    {
        if(queue.isEmpty())
            return;
        else{
            int ele = queue.remove();
            reverse(queue);
            queue.add(ele);
        }
    }
}
