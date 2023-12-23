package com.project.tree;

class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
    }
    Node(int data, Node left, Node right)
    {
        this.data=data;
        this.left=left;
        this.right=right;
    }
}

public class TreeTest {
    public static void main(String args[])
    {
        Node tree = new Node(10,new Node(20,new Node(40),new Node(50,new Node(70),new Node(80))),new Node(30,null,new Node(60)));

        System.out.print("\nInorder : ");
        inOrder(tree);
        System.out.print("\nPreorder : ");
        preOrder(tree);
        System.out.print("\nPostorder : ");
        postOrder(tree);
    }
    public static void inOrder(Node tree)
    {
        if(tree.left!=null)
            inOrder(tree.left);
        System.out.print(tree.data+" ");
        if(tree.right!=null)
            inOrder(tree.right);
    }
    public static void preOrder(Node tree)
    {
        System.out.print(tree.data+" ");
        if(tree.left!=null)
            preOrder(tree.left);
        if(tree.right!=null)
            preOrder(tree.right);
    }
    public static void postOrder(Node tree)
    {
        if(tree.left!=null)
            postOrder(tree.left);
        if(tree.right!=null)
            postOrder(tree.right);
        System.out.print(tree.data+" ");
    }
}
