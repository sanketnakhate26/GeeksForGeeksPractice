package com.project.tree;

public class HeightTree {
    public static void main(String args[])
    {
        Node tree = new Node(10,new Node(20,new Node(40),new Node(50,null,new Node(80))),new Node(30,null,new Node(60)));

        System.out.println("Height : "+getHeight(tree));
    }
    public static int getHeight(Node tree)
    {
        if(tree==null)
            return 0;
        else
            return Math.max(getHeight(tree.left),getHeight(tree.right)) + 1;

    }
}
