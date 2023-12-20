package com.project.linkedlist;

import java.util.Iterator;

class Node
{
    int value;
    Node next;
    Node(int value)
    {
        this.value=value;
        this.next=null;
    }
    Node(int value, Node next)
    {
        this.value=value;
        this.next=next;
    }
}

public class BasicOperations {
    public static void main(String args[])
    {
        Node head = new Node(10,new Node(20, new Node(30)));

        printLinkedList(head);
        int insertValueStart = 0;
        int insertValueEnd = 40;
        head=insertAtBegin(head,insertValueStart);
        printLinkedList(head);
        head=insertAtEnd(head,insertValueEnd);
        printLinkedList(head);
        int targetValue = 300;
        if(searchUsingRecussion(head,targetValue))
            System.out.println(targetValue+" value is present");
        else
            System.out.println(targetValue+" value is not present");


    }
    public static void printLinkedList(Node head)
    {
        Node ptr = head;
        System.out.print("LinkedList : ");
        while (ptr!=null)
        {
            System.out.print(ptr.value+" --> ");
            ptr=ptr.next;
        }
        System.out.println("null");
    }
    public static Node insertAtBegin(Node head, int value)
    {
        if(head==null)
            return new Node(value);
        else
        {
            Node temp = new Node(value);
            temp.next=head;
            System.out.println("Insert at start Successfull");
            return temp;
        }
    }
    public static Node insertAtEnd(Node head, int value)
    {
        Node tempNode = head;
        if(tempNode==null)
            return new Node(value);
        else{
            while(tempNode.next!=null)
                tempNode=tempNode.next;
            tempNode.next=new Node(value);
        }
        System.out.println("Insert At End successfull");
        return head;
    }
    public static boolean searchValue(Node head, int target)
    {
        Node tempNode = head;
        if(tempNode==null)
            return false;
        else{
            while (tempNode!=null)
            {
                if(tempNode.value==target)
                    return true;
                tempNode=tempNode.next;
            }
        }
        return false;
    }
    public static boolean searchUsingRecussion(Node head, int target)
    {
        if(head==null)
            return false;
        else{
            if(head.value==target)
                return true;
            else
                return searchUsingRecussion(head.next,target);
        }
    }
}
