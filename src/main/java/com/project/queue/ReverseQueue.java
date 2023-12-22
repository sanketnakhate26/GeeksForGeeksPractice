package com.project.queue;

import java.util.ArrayDeque;

public class ReverseQueue {
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
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        while (!queue.isEmpty())
            stack.push(queue.remove());
        while (!stack.isEmpty())
            queue.add(stack.poll());
    }
}
