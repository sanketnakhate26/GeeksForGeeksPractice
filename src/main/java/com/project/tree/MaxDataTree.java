package com.project.tree;

public class MaxDataTree {
    public static void main(String args[])
    {
        Node tree = new Node(10,new Node(20,new Node(140),new Node(50,new Node(70),new Node(80))),new Node(30,null,new Node(60)));

        System.out.print("\nTree Size : "+getMax(tree));

    }
    public static int getMax(Node tree)
    {
        if(tree==null)
            return Integer.MIN_VALUE;
        else{
            int left = getMax(tree.left);
            int right = getMax(tree.right);
            return left>right? (left>tree.data ? left : tree.data) : right>tree.data? right : tree.data;
        }
    }
}
