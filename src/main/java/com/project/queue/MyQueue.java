package com.project.queue;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
    Node(int data, Node next)
    {
        this.data=data;
        this.next=next;
    }
}

public class MyQueue {
    Node front;
    Node rear;
    MyQueue()
    {
        front = null;
        rear=null;
    }
    public void enQueue(int data)
    {
        Node newNode = new Node(data);
        if(rear==null)
        {
            front=rear=newNode;
        }
        else{
            rear.next=newNode;
            rear=newNode;
        }
    }
    public int deQueue()
    {
        if(front==null)
            return -1;
        else{
            if(front==rear)
            {
                front=null;
                rear=null;
            }
            else{
                front=front.next;
            }
        }
        return 1;
    }
    public int size()
    {
        int size=1;
        if(front==null)
            return 0;
        else if(front==rear)
            return 1;
        else{
            Node temp = front;
            while (temp!=rear)
            {
                temp=temp.next;
                size++;
            }
        }
        return size;
    }

    public static void main(String args[])
    {
        MyQueue myQueue = new MyQueue();
        myQueue.enQueue(10);
        myQueue.enQueue(20);
        myQueue.enQueue(30);
        System.out.println("size = "+myQueue.size());
        myQueue.deQueue();
        myQueue.deQueue();
        System.out.println("size = "+myQueue.size());


    }
}
