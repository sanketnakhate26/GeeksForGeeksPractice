package com.project.tree;

import java.util.ArrayDeque;

public class LevelOrderByLine {
    public static void main(String args[])
    {
        Node tree = new Node(10,new Node(20,new Node(40),new Node(50,new Node(70),new Node(80))),new Node(30,null,new Node(60)));

        System.out.print("\nLevel Order : ");
        printLevelOrderByLine(tree);
    }
    public static void printLevelOrderByLine(Node tree)
    {
        if(tree==null)
            return;
        else{
            ArrayDeque<Node> queue = new ArrayDeque<>();
            queue.offer(tree);
            while (!queue.isEmpty())
            {
                int size = queue.size();
                for(int i=0;i<size;i++)
                {
                    Node node = queue.remove();
                    if(node.left!=null)
                        queue.offer(node.left);
                    if(node.right!=null)
                        queue.offer(node.right);
                    System.out.print(node.data+" ");
                }
                System.out.println("");
            }

        }
    }
}
