package com.project.bst;


public class Insert {
    public static void main(String args[])
    {
        TreeNode root = null;
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 11);
        root = insert(root, 22);

        printInOrder(root);
    }
    public static TreeNode insert(TreeNode root, int value)
    {
        if(root==null)
            return new TreeNode(value);

        if(root.value > value)
            root.left = insert(root.left,value);
        else
            root.right = insert(root.right,value);

        return root;
    }
    public static void printInOrder(TreeNode root)
    {
        if(root==null)
            return;
        else{
            printInOrder(root.left);
            System.out.print(root.value+" ");
            printInOrder(root.right);
        }
    }
}
