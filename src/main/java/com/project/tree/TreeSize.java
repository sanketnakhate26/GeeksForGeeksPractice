package com.project.tree;

public class TreeSize {
    public static void main(String args[])
    {
        Node tree = new Node(10,new Node(20,new Node(40),new Node(50,new Node(70),new Node(80))),new Node(30,null,new Node(60)));

        System.out.print("\nTree Size : "+getSize(tree));

    }
    public static int getSize(Node tree)
    {
        if(tree==null)
            return 0;
        else{
            return getSize(tree.left) + getSize(tree.right) + 1;
        }
    }
}
