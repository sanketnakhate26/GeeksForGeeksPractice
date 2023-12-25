package com.project.graph;

import java.util.ArrayList;

public class DFS {
    public static void main(String args[])
    {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<6;i++)
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

        boolean[] visited = new boolean[graph.size()+1];
        printDFS(graph,0,visited);
    }
    public static void printDFS(ArrayList<ArrayList<Integer>> graph, int source,boolean[] visited)
    {
        visited[source]=true;
        System.out.print(source+" ");
        for(int i : graph.get(source))
        {
            if(visited[i]==false)
                printDFS(graph,i,visited);
        }
    }
}
