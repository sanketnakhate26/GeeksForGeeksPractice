package com.project.graph;

import java.util.ArrayList;

public class GraphTest {
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

        //print graph
        for(int i=0;i<graph.size();i++)
        {
            for(int j=0;j<graph.get(i).size();j++)
                System.out.print(graph.get(i).get(j)+" ");
            System.out.println();
        }




    }
}
