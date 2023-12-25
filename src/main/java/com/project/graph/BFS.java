package com.project.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
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

        printBFS(graph,0);
    }
    public static void printBFS(ArrayList<ArrayList<Integer>> graph,int source)
    {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[graph.size()+1];
        visited[source]=true;
        queue.add(source);
        while (!queue.isEmpty()){
            int current = queue.poll();
            for(int j=0;j<graph.get(current).size();j++)
            {
                if(visited[graph.get(current).get(j)]==false)
                {
                    visited[graph.get(current).get(j)]=true;
                    queue.add(graph.get(current).get(j));
                }
            }
            System.out.print(current+" ");
        }
    }
}
