package com.project.heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Triplet implements Comparable<Triplet>
{
    int value;
    int ap;
    int vp;
    Triplet(int value,int ap, int vp)
    {
        this.value=value;
        this.ap=ap;
        this.vp=vp;
    }

    @Override
    public int compareTo(Triplet o) {
        if(value < o.value)
            return -1;
        else
            return 1;
    }
}


public class MergeKArray {
    public static void main(String args[])
    {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        //input array

        arr.add(new ArrayList<>());
        arr.add(new ArrayList<>());
        arr.add(new ArrayList<>());

        arr.get(0).add(5);
        arr.get(0).add(10);
        arr.get(1).add(4);
        arr.get(1).add(9);
        arr.get(2).add(6);

        PriorityQueue<Triplet> heap = new PriorityQueue<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<arr.size();i++)
        {
            heap.add(new Triplet(arr.get(i).get(0),i,0));
        }

        while (!heap.isEmpty()){
            Triplet curr = heap.poll();
            result.add(curr.value);
            if(curr.vp+1 < arr.get(curr.ap).size())
                heap.add(new Triplet(arr.get(curr.ap).get(curr.vp+1),curr.ap,curr.vp+1));
        }
        System.out.println(result.toString());
    }
}
