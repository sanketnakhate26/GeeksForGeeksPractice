package com.project.linkedlist;

public class ReverseLinkedList {
    public static void main(String args[])
    {

        Node head = new Node(10,new Node(20,new Node(30, new Node(40))));

        BasicOperations.printLinkedList(head);
        System.out.print("Linked List : ");
        head=reverseLinkedListIteration(head);
        System.out.print("\n After reverse : ");
        BasicOperations.printLinkedList(head);
    }
    public static Node reverseLinkedList(Node head)
    {
        if(head==null || head.next==null)
            return head;
        else
        {
            Node newHead = reverseLinkedList(head.next);
            head.next.next=head;
            head.next=null;
            return newHead;
        }
    }

    public static Node reverseLinkedListIteration(Node head)
    {
        if(head==null || head.next==null)
            return head;
        else
        {
            Node prev = null;
            Node curr = head;
            while (curr.next!=null)
            {
                Node temp = curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
            }
            curr.next=prev;
            return curr;
        }
    }
}
