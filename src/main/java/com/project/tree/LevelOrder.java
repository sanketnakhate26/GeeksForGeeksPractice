package com.project.tree;

import java.util.ArrayDeque;

public class LevelOrder {
    public static void main(String args[])
    {
        Node tree = new Node(10,new Node(20,new Node(40),new Node(50,new Node(70),new Node(80))),new Node(30,null,new Node(60)));

        System.out.print("\nLevel Order : ");
        printLevelOrder(tree);
    }
    public static void printLevelOrder(Node tree)
    {
        if(tree==null)
            return;
        else{
            ArrayDeque<Node> queue = new ArrayDeque<>();
            queue.add(tree);
            while (!queue.isEmpty())
            {
                Node currNode = queue.remove();
                System.out.print(currNode.data+" ");
                if(currNode.left!=null)
                    queue.offer(currNode.left);
                if(currNode.right!=null)
                    queue.offer(currNode.right);
            }
        }
    }
}
