package com.project.linkedlist;

class DNode
{
    int value;
    DNode next;
    DNode prev;
    DNode(int value){
        this.value=value;
        this.next=null;
        this.prev=null;
    }

    DNode(int value,DNode next)
    {
        this.value=value;
        this.prev=prev;
        this.next=next;
    }
}


public class DLL {
    public static void main(String args[])
    {
        DNode head = new DNode(10);
        DNode temp=new DNode(20);
        head.next=temp;
        temp.prev=head;

        temp=new DNode(30);
        head.next.next=temp;
        temp.prev=head.next;

        temp=new DNode(40);
        head.next.next.next=temp;
        temp.prev=head.next.next;

        printDLL(head);
        head=reverse(head);
        printDLL(head);

    }
    public static void printDLL(DNode head)
    {
        if(head==null)
            System.out.println("null");
        else{
            System.out.print(head.value+" <--> ");
            printDLL(head.next);
        }
    }
    public static DNode reverse(DNode head)
    {
        if(head==null || head.next==null)
            return head;

        DNode prev = null; DNode curr=head;
        while (curr.next!=null)
        {
            DNode temp = curr.next;
            curr.next=prev;
            curr.prev=temp;
            prev=curr;
            curr=temp;
        }
        curr.next=prev;
        return curr;
    }
}
