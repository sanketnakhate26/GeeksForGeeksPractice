package com.project.linkedlist;

public class SegregateEvenOdd {
    public static void main(String args[])
    {
        Node head = new Node(10,new Node(11,new Node(12,new Node(13,new Node(14)))));
        BasicOperations.printLinkedList(head);

        segregateEvenOdd(head);
        BasicOperations.printLinkedList(head);
    }
    public static Node segregateEvenOdd(Node head)
    {
        Node evenStart = null, evenEnd=null, oddStart=null, oddEnd=null;

        for(Node curr=head; curr!=null; curr=curr.next)
        {
            int x = curr.value;
            if(x%2==0){
                if(evenStart==null)
                    evenStart=evenEnd=curr;
                else
                {
                    evenEnd.next=curr;
                    evenEnd=curr;
                }
            }
            else{
                if(oddStart==null)
                    oddStart=oddEnd=curr;
                else
                {
                    oddEnd.next=curr;
                    oddEnd=curr;
                }
            }
        }

        if(evenStart==null || oddStart==null)
            return head;
        else
        {
            evenEnd.next=oddStart;
            oddEnd.next=null;
            return evenStart;
        }
    }
}
