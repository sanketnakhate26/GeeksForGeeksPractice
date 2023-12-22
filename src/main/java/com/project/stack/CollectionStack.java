package com.project.stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;

public class CollectionStack {
    public static void main(String args[])
    {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.push(10);
        arrayDeque.push(20);
        arrayDeque.push(30);

        Iterator<Integer> it = arrayDeque.iterator();
        while (it.hasNext())
            System.out.print(it.next()+" ");

        arrayDeque.pop();
        arrayDeque.pop();
        System.out.println();
        it = arrayDeque.iterator();
        while (it.hasNext())
            System.out.print(it.next()+" ");
    }
}
