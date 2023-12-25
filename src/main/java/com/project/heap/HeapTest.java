package com.project.heap;

import java.util.Iterator;

class MinHeap
{
    int[] arr;
    int size;
    int capacity;
    MinHeap(int capacity)
    {
        arr=new int[capacity];
        size=0;
        this.capacity=capacity;
    }
    void insert(int value)
    {
        if(size==capacity-1)
            return;
        else{
            arr[size]=value;
            size++;
        }
        for(int i=size-1; i>=0 && arr[parent(i)] > arr[i];)
        {
            int temp=arr[parent(i)];
            arr[parent(i)]=arr[i];
            arr[i]=temp;
            i=parent(i);
        }
    }
    int extractMin()
    {
        int result = 0;
        if(size==0)
            return Integer.MAX_VALUE;
        if(size==0)
        {
            size--;
            return arr[0];
        }else{
            result = arr[0];
            arr[0]=arr[size-1];
            size--;
            hipify(0);
        }
        return result;
    }
    void hipify(int i)
    {
        int left = left(i);
        int right = right(i);
        int smallest = i;

        if(left<size && arr[left] < arr[smallest])
            smallest=left;
        if(right<size && arr[right] < arr[smallest])
            smallest=right;
        if(smallest!=i)
        {
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;

            hipify(smallest);
        }
    }
    int left(int i)
    {
        return 2*i+1;
    }
    int right(int i)
    {
        return 2*i+2;
    }
    int parent(int i)
    {
        return (i-1)/2;
    }
    void printHeap()
    {
        System.out.print("\nHeap : ");
        for(int i=0;i<size;i++)
            System.out.print(arr[i]+" ");
    }
}


public class HeapTest {
    public static void main(String args[])
    {
        MinHeap root = new MinHeap(20);
        root.insert(20);
        root.insert(10);
        root.insert(5);

        root.printHeap();
        System.out.println("Min value : "+root.extractMin());
        System.out.println("After extract ");
        root.printHeap();



    }
}
