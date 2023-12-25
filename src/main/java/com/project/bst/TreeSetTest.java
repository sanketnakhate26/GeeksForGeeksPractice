package com.project.bst;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSetTest {
    public static void main(String args[])
    {
        TreeSet<Integer> root = new TreeSet<>();
        root.add(10);
        root.add(20);
        root.add(5);
        root.add(25);
        root.add(22);
        root.add(8);
        root.add(3);

        Iterator<Integer> it = root.iterator();
        while (it.hasNext())
            System.out.print(it.next()+" ");

        root.remove(22);

        System.out.print("\nAfter remove 22 : ");
        it = root.iterator();
        while (it.hasNext())
            System.out.print(it.next()+" ");
    }
}
