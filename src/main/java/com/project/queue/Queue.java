package com.project.queue;

import java.util.*;

public class Queue {
    public static void main(String args[])
    {
        java.util.Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println("size "+queue.size());
        printQueue(queue);
        System.out.println("peek "+queue.peek());
        queue.remove();
        queue.poll();
        System.out.println();
        printQueue(queue);


    }
    public static void printQueue(java.util.Queue<Integer> queue)
    {
        Iterator<Integer> it = queue.iterator();
        while (it.hasNext())
            System.out.print(it.next()+" ");
    }
}
