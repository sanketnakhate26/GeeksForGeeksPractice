package com.project.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SourceToShortest {
    public static void main(String args[])
    {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<4;i++)
            graph.add(new ArrayList<Integer>());

        // graph initalised
        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(0);
        graph.get(1).add(2);
        graph.get(1).add(3);

        graph.get(2).add(0);
        graph.get(2).add(1);

        graph.get(3).add(1);

        printShortestPath(graph,0);
    }
    public static void printShortestPath(ArrayList<ArrayList<Integer>> graph, int source)
    {
        int v = graph.size();
        System.out.println("size : "+v);
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[v];
        ArrayList<Integer> result = new ArrayList<>(v);

        queue.add(source);
        visited[source]=true;
        int count=0;
        result.add(source,count);
        while (!queue.isEmpty())
        {
            int current = queue.poll();
            count=count+1;
            for(int adjecent : graph.get(current))
            {
                if(visited[adjecent]==false)
                {
                    visited[adjecent]=true;
                    queue.add(adjecent);
                    result.add(adjecent,count);
                }
            }
        }
        for(int i=0;i<result.size();i++)
            System.out.print(i+" : "+result.get(i)+" | ");
    }
}
