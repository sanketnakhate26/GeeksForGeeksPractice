package com.project.tree;

public class PrintKDepthTree {
    public static void main(String args[])
    {
        Node tree = new Node(10,new Node(20,new Node(40),new Node(50,new Node(70),new Node(80))),new Node(30,null,new Node(60)));
        int k = 4;
        printKDepthNodes(tree,1,k);
    }
    public static void printKDepthNodes(Node tree, int depth, int k)
    {
        if(tree!=null)
        {
            if(depth<k)
            {
                printKDepthNodes(tree.left,depth+1,k);
                printKDepthNodes(tree.right,depth+1,k);
            }
            else
                System.out.print(tree.data+" ");

        }
        return;
    }
}
