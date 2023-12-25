package com.project.graph;

import java.util.*;

public class TopologicalSort {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 5; i++)
            graph.add(new ArrayList<Integer>());

        // graph initalised
        graph.get(0).add(3);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);
        graph.get(2).add(3);
        graph.get(4).add(3);

        topologicalSort(graph);

    }
    public static void topologicalSort(ArrayList<ArrayList<Integer>> graph)
    {
        boolean[] visited = new boolean[graph.size()];
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i=0;i<graph.size();i++)
        {
            if(visited[i]==false)
                topoDFS(graph,i,visited,stack);
        }

        while (!stack.isEmpty())
            System.out.print(stack.pop()+" ");
    }
    public static void topoDFS(ArrayList<ArrayList<Integer>> graph, int v, boolean[] visited, ArrayDeque<Integer> stack)
    {
        visited[v]=true;
        for(int adj : graph.get(v)){
            if(visited[adj]==false)
                topoDFS(graph,adj,visited,stack);
        }
        stack.add(v);
    }
}
