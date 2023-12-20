package com.project.linkedlist;

import java.util.LinkedList;

public class JavaLinkedList {
    public static void main(String args[])
    {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);

        System.out.println("LinkedList : "+ll.toString());
        ll.remove((Object)20);
        ll.remove(0);
        System.out.println("LinkedList : "+ll.toString());

    }
}
